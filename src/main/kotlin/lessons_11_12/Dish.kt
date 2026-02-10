package lessons_11_12

class Dish(
    private val id: Int,
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavourites: Boolean = false,
) {

    fun addToFavourites(){
        println("Блюдо $name добавлено в избранное")
        inFavourites = true
    }

    fun removeFromFavourites(){
        println("Блюдо $name удалено из избранного")
        inFavourites = false
    }

    fun startCooking(){
        println("Пользователь перешел на экран приготовления блюда $name ")
    }

    fun downloadIngredients(): List<String>{
        return ingredients
    }

}