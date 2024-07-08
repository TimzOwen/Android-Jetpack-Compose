// FOR LOOP --> used for iterations
fun main() {
    var shoppingList = mutableListOf("RAM","SSD","VGA","RFID","UAT","PROD") // list of items

    // iterate through each item and print [ use until to print indexes ]
    for (index in 0 until  shoppingList.size) {
        println("item ${shoppingList[index]} is at index $index")
    }

}