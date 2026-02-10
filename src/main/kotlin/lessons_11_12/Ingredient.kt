package lessons_11_12

class Ingredient(val name: String, val weight: Int, val count: Int){

    var isNeedToPrepare = false

    constructor(
        name: String,
        weight: Int,
        count: Int,
        isNeedToPrepare: Boolean,
    ): this(name,weight,count){

        this.isNeedToPrepare = isNeedToPrepare

    }

    init {
        println("Ингредиент $name создан")
    }
}

