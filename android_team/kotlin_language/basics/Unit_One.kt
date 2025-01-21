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



// 004
//updating variables
// var - mutable and can be updated.
fun main(){
    var totalCost = 0
    totalCost = 200
    println("New cost $totalCost")
}



// 005 
// Increament & Decreament
//
fun main(){
    var totalCost = 0
    totalCost = 200
    
    totalCost = totalCost + 1
    
    totalCost ++ // increament
    
    totalCost -- // decreament
    
    println("New cost $totalCost")
}


//006
// Data types --> String, Int, Double, Float & Boolean 
// Commenting your code {Single Line & Multiline}


//007
//Functions - code snipent that performs specific tasks
// fun - keyword
fun main(){
    happyBirthday()
}
fun happyBirthday(){
    println("its your birthday")
}


//
//007 - a
// Function return types
// return keyword -> specify data type you want returned
// Unit - default return type == void
fun main(){
    happyBirthday()
}
fun happyBirthday(): Unit {
    println("Hello its your birthday")
    println("You are now 5 years old.")
}


// Return String
fun main(){
    println(happyBirthday())
}
fun happyBirthday(): String{
    val userName = "Timz"
    val age = 45
    return "Happy birthday $userName \n you are $age years old"
}

// parameters -> variables & data types declared here to be used in the function
// Function signatures --> tell you fun name and its parameters.
fun main(){
    println(happyBirthday("Timz",50))
    println(happyBirthday("James",20))
}
fun happyBirthday(name: String, years: Int): String {
    val greeting = "Happy birthday $name"
    val age = "You are $years years old"
    return "$greeting \n $age"
}

// named parameter
fun main(){
    println(happyBirthday(age=53,name="Owen"))
}
fun happyBirthday(name: String, age:Int): String{
    val greeting = "happy birthday $name"
    val old = "you are $age years old"
    return "$greeting \n $old"
}

// default arguements
fun main(){
    println(happyBirthday(age=59))  // you have to use named arg
    println(happyBirthday("James",100))
}
fun happyBirthday(name:String="Owen", age: Int): String {
    val greeting = "happy birthday $name"
    val years = "you are $age years old"
    return "$greeting \n $years"
}


//
//
//
