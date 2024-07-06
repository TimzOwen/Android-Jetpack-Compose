// LISTS & FOR LOOPS
fun main(){
    // immutable list of items
    val shoppingList = listOf("RAM","SSD","Keyboard","Server")

    // mutable list of items
    val mutableShoppingList = mutableListOf("RAM","SSD","Keyboard","Server")
    mutableShoppingList.add("HDD") // adding items to list
    mutableShoppingList.remove("HDD") // remove by string
    mutableShoppingList.removeAt(0) // delete at specific index
    mutableShoppingList.add(0,"Monitor") // add as first element
    mutableShoppingList[0] = "curved monitor" // update existing element
    mutableShoppingList.set(1,"SSD-256") // use set method to update elements
    println(mutableShoppingList.contains("SSD-256")) // check if it contains an element

    println(mutableShoppingList[0]) // print only at specific index
    println(mutableShoppingList) // print all elements of a list
}