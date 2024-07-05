// Functions

fun main(){
    // call the function here
    makeCoffee(1, "Owen")
    makeCoffee(0, "Abdul")
    makeCoffee(3,"Timz")


}

// create functions to be reused
fun makeCoffee(sugarCount: Int, userName: String){
    when(sugarCount){
        0 -> println("Coffee with no sugar for $userName")
        1 -> println("Coffee with $sugarCount tea spoon for $userName")
        else -> println("Coffee with $sugarCount tea spoons for $userName")
    }
}