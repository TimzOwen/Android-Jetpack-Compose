// Functions

fun main(){
    // call the function here
    println("Whose the coffee for? ")
    val userName = readln()
    println("How many tea spoons? ")
    val spoonCounter = readln().toInt()

    makeCoffee(spoonCounter, userName )


}

// create functions to be reused
fun makeCoffee(sugarCount: Int, userName: String){
    when(sugarCount){
        0 -> println("Coffee with no sugar for $userName")
        1 -> println("Coffee with $sugarCount tea spoon for $userName")
        else -> println("Coffee with $sugarCount tea spoons for $userName")
    }
}