import classes.Dog

// use data classes to simplify files not needed or called else where.
data class CoffeeDetails(
    val sugarCount: Int,
    val userName: String,
    val size: String,
    val creamAmount: Int
)

fun main() {

    val coffeeList = CoffeeDetails(2,"Timz","XL",4)
    makeCoffee(coffeeList)
}

fun askCoffeeDetails(){
    println("whose coffee is it for? ...")
    val userName = readln()
    println("How many pieces of sugar?....")
    val sugarCount = readln().toInt()
}

fun makeCoffee(coffeeDetails: CoffeeDetails){
    when(coffeeDetails.sugarCount){
        0 -> println("Coffee with no sugar for ${coffeeDetails.userName} add cream: ${coffeeDetails.creamAmount} size ${coffeeDetails.size}")
        1 -> println("Coffee with ${coffeeDetails.sugarCount} spoon for ${coffeeDetails.userName} add cream: ${coffeeDetails.creamAmount} size ${coffeeDetails.size}")
        else -> println("Coffee with ${coffeeDetails.sugarCount} spoons for ${coffeeDetails.userName} add cream: ${coffeeDetails.creamAmount} size ${coffeeDetails.size}")
    }
}