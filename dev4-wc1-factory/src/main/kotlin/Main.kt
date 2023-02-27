fun main(args: Array<String>) {
    println("Let's build a food factory")

    val kitchen = DarkKitchen()

    //Test statements
    /*
    kitchen.addItemToMenu("BURGER", "Cheeseburger", 6.99)
    kitchen.addItemToMenu("BURGER", "Fish burger", 8.99)
    kitchen.addItemToMenu("PIZZA", "Margherita", 9.99)
    println(kitchen.menu)
    */

    /*
    kitchen.addDiscountToAll(10)
    for(item in kitchen.menu) {
        println(item.price.toString())
    }
    */
}

//Create the 'Meal' interface (type, name, price)

//Create classes for every type of Meal that inherit from 'Meal'

//Complete the DarkKitchen class
class DarkKitchen {
    //var menu = mutableListOf<Meal>()

    fun addItemToMenu(type: String, name: String, price: Double) {

    }

    fun addDiscountToAll(percentage: Int) {
        //...
    }

}

class FoodFactory {
    fun createItem(type: String, name: String, price: Double) {

    }
}

