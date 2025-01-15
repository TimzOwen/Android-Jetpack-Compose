// unit one basics

// 001 Function
// - segment of code that executes a certain task [declare & call]
fun main(){
    println("hello world")

}


// 002
// varibles - container for holding single peace of data
// val - value 
// string concatination + variable
// type inference - kotlin compiler can determine varibale DT without being explicity declared
val userName: String = "Timz Owen"
val count: Int = 5
val name = "Timz" // type inference



// 003
// Math Operations
//  
fun main(){
    val numOfStock = 500
    val soldStock = 200 
    println("Remaining stock is ${numOfStock - soldStock} items")
}



// 0004
//updating variables
// var - mutable and can be updated.
fun main(){
    var totalCost = 0
    totalCost = 200
    println("New cost $totalCost")
}
