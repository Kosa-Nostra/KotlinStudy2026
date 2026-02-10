package lessons_11_12

fun main() {

    val dish1: Dish = Dish(
        id = 1,
        name = "Pancake",
        category = "Desert",
        ingredients = listOf("eggs", "flour", "sugar", "milk"),
    )
    val dish2: Dish = Dish(
        id = 2,
        name = "Яичница",
        category = "Завтраки",
        ingredients = listOf("яйцо", "помидор", "перец", "соль"),
    )

//    println(dish1.name)
//    println(dish1.category)
//    println(dish1.ingredients)
//println()
//    println(dish2.name)
//    println(dish2.category)
//    println(dish2.ingredients)
//println()
//    dish2.category = "Блюда из яиц"
//    dish1.inFavourites = true
//    println(dish2.category)
//    println(dish1.inFavourites)

    println("Действия для блюда Pancakes")
    dish1.addToFavourites()
    println(dish1.inFavourites)
    dish1.startCooking()
    println()

    println("Действия для блюда Яичница")
    dish2.addToFavourites()
    println(dish2.inFavourites)
    dish2.startCooking()
    val ingredientsOfEgg = dish2.downloadIngredients()
    println(ingredientsOfEgg)
    dish2.removeFromFavourites()
    println(dish2.inFavourites)

//    LESSON 12
    val ingredient1 = Ingredient(name = "картошка", weight = 1, count = 1)
    val ingredient2 = Ingredient(name = "морковь", weight = 1, count = 1)
    println(ingredient1.name)
    println(ingredient2.name)

//вторичный конструктор
//    первичный конструктор
//    блоки init
//   тело вторичного конструктора
}