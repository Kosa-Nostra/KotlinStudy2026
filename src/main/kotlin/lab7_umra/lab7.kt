package lab7_umra

import java.util.Scanner

class BTreeNode(var t: Int, var leaf: Boolean) {
    var keys = IntArray(2 * t - 1)
    var children = Array<BTreeNode?>(2 * t) { null }
    var n = 0

    fun search(k: Int): BTreeNode? {
        var i = 0
        while (i < n && k > keys[i]) {
            i++
        }
        var result: BTreeNode? = null
        if (i < n && keys[i] == k) {
            result = this
        } else if (!leaf) {
            result = children[i]?.search(k)
        }
        return result
    }

    // --- БЛОК ВСТАВКИ ---
    fun insertNonFull(k: Int) {
        var i = n - 1
        if (leaf) {
            while (i >= 0 && keys[i] > k) {
                keys[i + 1] = keys[i]
                i--
            }
            keys[i + 1] = k
            n++
        } else {
            while (i >= 0 && keys[i] > k) {
                i--
            }
            if (children[i + 1]!!.n == 2 * t - 1) {
                splitChild(i + 1, children[i + 1]!!)
                if (keys[i + 1] < k) {
                    i++
                }
            }
            children[i + 1]!!.insertNonFull(k)
        }
    }

    fun splitChild(i: Int, y: BTreeNode) {
        val z = BTreeNode(y.t, y.leaf)
        z.n = t - 1
        var j = 0
        while (j < t - 1) {
            z.keys[j] = y.keys[j + t]
            j++
        }
        if (!y.leaf) {
            j = 0
            while (j < t) {
                z.children[j] = y.children[j + t]
                j++
            }
        }
        y.n = t - 1
        j = n
        while (j >= i + 1) {
            children[j + 1] = children[j]
            j--
        }
        children[i + 1] = z
        j = n - 1
        while (j >= i) {
            keys[j + 1] = keys[j]
            j--
        }
        keys[i] = y.keys[t - 1]
        n++
    }

    // --- БЛОК УДАЛЕНИЯ ---
    fun findKey(k: Int): Int {
        var idx = 0
        while (idx < n && keys[idx] < k) {
            idx++
        }
        return idx
    }

    fun remove(k: Int) {
        val idx = findKey(k)
        if (idx < n && keys[idx] == k) {
            if (leaf) {
                removeFromLeaf(idx)
            } else {
                removeFromNonLeaf(idx)
            }
        } else {
            if (leaf) {
                println("Ключ $k не найден в дереве.")
            } else {
                val flag = (idx == n)
                if (children[idx]!!.n < t) {
                    fill(idx)
                }
                if (flag && idx > n) {
                    children[idx - 1]!!.remove(k)
                } else {
                    children[idx]!!.remove(k)
                }
            }
        }
    }

    fun removeFromLeaf(idx: Int) {
        var i = idx + 1
        while (i < n) {
            keys[i - 1] = keys[i]
            i++
        }
        n--
    }

    fun removeFromNonLeaf(idx: Int) {
        val k = keys[idx]
        if (children[idx]!!.n >= t) {
            val pred = getPred(idx)
            keys[idx] = pred
            children[idx]!!.remove(pred)
        } else if (children[idx + 1]!!.n >= t) {
            val succ = getSucc(idx)
            keys[idx] = succ
            children[idx + 1]!!.remove(succ)
        } else {
            merge(idx)
            children[idx]!!.remove(k)
        }
    }

    fun getPred(idx: Int): Int {
        var cur = children[idx]!!
        while (!cur.leaf) {
            cur = cur.children[cur.n]!!
        }
        return cur.keys[cur.n - 1]
    }

    fun getSucc(idx: Int): Int {
        var cur = children[idx + 1]!!
        while (!cur.leaf) {
            cur = cur.children[0]!!
        }
        return cur.keys[0]
    }

    fun fill(idx: Int) {
        if (idx != 0 && children[idx - 1]!!.n >= t) {
            borrowFromPrev(idx)
        } else if (idx != n && children[idx + 1]!!.n >= t) {
            borrowFromNext(idx)
        } else {
            if (idx != n) {
                merge(idx)
            } else {
                merge(idx - 1)
            }
        }
    }

    fun borrowFromPrev(idx: Int) {
        val child = children[idx]!!
        val sibling = children[idx - 1]!!
        var i = child.n - 1
        while (i >= 0) {
            child.keys[i + 1] = child.keys[i]
            i--
        }
        if (!child.leaf) {
            i = child.n
            while (i >= 0) {
                child.children[i + 1] = child.children[i]
                i--
            }
        }
        child.keys[0] = keys[idx - 1]
        if (!child.leaf) {
            child.children[0] = sibling.children[sibling.n]
        }
        keys[idx - 1] = sibling.keys[sibling.n - 1]
        child.n += 1
        sibling.n -= 1
    }

    fun borrowFromNext(idx: Int) {
        val child = children[idx]!!
        val sibling = children[idx + 1]!!
        child.keys[child.n] = keys[idx]
        if (!child.leaf) {
            child.children[child.n + 1] = sibling.children[0]
        }
        keys[idx] = sibling.keys[0]
        var i = 1
        while (i < sibling.n) {
            sibling.keys[i - 1] = sibling.keys[i]
            i++
        }
        if (!sibling.leaf) {
            i = 1
            while (i <= sibling.n) {
                sibling.children[i - 1] = sibling.children[i]
                i++
            }
        }
        child.n += 1
        sibling.n -= 1
    }

    fun merge(idx: Int) {
        val child = children[idx]!!
        val sibling = children[idx + 1]!!
        child.keys[t - 1] = keys[idx]
        var i = 0
        while (i < sibling.n) {
            child.keys[i + t] = sibling.keys[i]
            i++
        }
        if (!child.leaf) {
            i = 0
            while (i <= sibling.n) {
                child.children[i + t] = sibling.children[i]
                i++
            }
        }
        i = idx + 1
        while (i < n) {
            keys[i - 1] = keys[i]
            i++
        }
        i = idx + 2
        while (i <= n) {
            children[i - 1] = children[i]
            i++
        }
        child.n += sibling.n + 1
        n--
    }
}

class BTree(val t: Int) {
    var root: BTreeNode? = null

    // Горизонтальный вывод
    fun printTreeHorizontal() {
        if (root != null && root!!.n > 0) {
            println("\n--- B-дерево ---")

            val queue = Array<BTreeNode?>(1000) { null }
            var head = 0
            var tail = 0

            queue[tail] = root
            tail++

            var level = 0
            val maxKeys = 2 * t - 1

            while (head < tail) {
                val levelSize = tail - head
                print("Уровень $level:  ")

                var i = 0
                while (i < levelSize) {
                    val curr = queue[head]
                    head++

                    print("[")
                    var j = 0
                    while (j < maxKeys) {
                        if (j < curr!!.n) {
                            print(curr.keys[j])
                        } else {
                            print("  ")
                        }

                        if (j < maxKeys - 1) {
                            print("|")
                        }
                        j++
                    }
                    print("]   ")

                    curr?.leaf?.let {
                        if (!it) {
                            var k = 0
                            while (k <= curr.n) {
                                if (curr.children[k] != null) {
                                    queue[tail] = curr.children[k]
                                    tail++
                                }
                                k++
                            }
                        }
                    }
                    i++
                }
                println()
                level++
            }
            println("------------------------------------------")
        } else {
            println("Дерево пустое.")
        }
    }

    fun search(k: Int): BTreeNode? {
        var result: BTreeNode? = null
        if (root != null) {
            result = root?.search(k)
        }
        return result
    }

    fun insert(k: Int) {
        if (root == null) {
            root = BTreeNode(t, true)
            root?.keys?.set(0, k)
            root?.n = 1
        } else {
            if (root!!.n == 2 * t - 1) {
                val s = BTreeNode(t, false)
                s.children[0] = root
                s.splitChild(0, root!!)
                var i = 0
                if (s.keys[0] < k) {
                    i++
                }
                s.children[i]!!.insertNonFull(k)
                root = s
            } else {
                root!!.insertNonFull(k)
            }
        }
    }

    fun remove(k: Int) {
        if (root == null) {
            println("Дерево пустое.")
        } else {
            root!!.remove(k)
            if (root!!.n == 0) {
                if (root!!.leaf) {
                    root = null
                } else {
                    root = root!!.children[0]
                }
            }
        }
    }
}

fun main() {
    val scanner = Scanner(System.`in`)
    val tree = BTree(2)

    var running = true
    while (running) {
        println("\nМеню B-дерева:")
        println("1. Вставить число")
        println("2. Найти число")
        println("3. Удалить число")
        println("4. Показать дерево")
        println("5. Загрузить тестовые данные")
        println("0. Выход")
        print("Выбор: ")

        val choice = scanner.nextInt()

        if (choice == 1) {
            print("Введите число для вставки: ")
            val k = scanner.nextInt()
            tree.insert(k)
            println("Число $k вставлено.")
        } else if (choice == 2) {
            print("Введите число для поиска: ")
            val k = scanner.nextInt()
            if (tree.search(k) != null) {
                println("Успех: Число $k найдено в дереве!")
            } else {
                println("Ошибка: Число $k не найдено.")
            }
        } else if (choice == 3) {
            print("Введите число для удаления: ")
            val k = scanner.nextInt()
            tree.remove(k)
            println("Операция удаления выполнена.")
        } else if (choice == 4) {
            tree.printTreeHorizontal()
        } else if (choice == 5) {
            val keysToInsert = intArrayOf(30, 70, 8, 25, 40, 50, 76, 88, 1, 3, 7, 15, 21, 23, 26, 28, 35, 38, 42, 49, 56, 67, 71, 73, 75, 77, 85, 89, 97)
            var i = 0
            while (i < keysToInsert.size) {
                tree.insert(keysToInsert[i])
                i++
            }
            println("Тестовые данные из Варианта 1 успешно загружены!")
        } else if (choice == 0) {
            println("Завершение работы.")
            running = false
        } else {
            println("Неверный выбор.")
        }
    }
}