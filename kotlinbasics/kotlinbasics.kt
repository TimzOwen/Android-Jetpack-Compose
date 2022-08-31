// Main function that prints hello world
fun main(){
    print("Hello Android !")
}



// print more than one line
fun main(){
    println("Hey line one !")
    println("Hello line 2 ! ")
}

// Fixing Errors, 

/* While writing code you will face some errors ,
In android studion this can be seen on the log cat and marked with 
Red color if one is using other editors */

// Kotlin Variables
// used to store values temporarily in comp space.-->booking space
// Integers,strings,
// double--> number with a decimal,
// float--> dedimal number ending with .f / .F
fun main(){
    val name : String = "Timz"
    val age : Int = 15
    val bankBal : Double = 15000.50
    val balance : 

    println(name)
    println(age)
    println(bankBal)
    println(balance)
}

// doubles
fun main() {
    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
    val totalTripLength: Double = 0.0
    println("$totalTripLength miles left to destination")
    println("Totoal destination is: ${trip1 + trip2 + trip3} miles")
}

// String concatenation with variables using dollar and curl bracekts
fun main() {
    val name : String = "Timz Owen"
    val age : String = "30"
    println(" Hello ${name} you are ${age} years old")
    println(name + age)
}

// Boolean--> When a value has only two posible answers/outcome
fun main(){
    val isRaining = true
    print(isRaining)
}

// Escaping backslash in strings(print special char in strings)
fun main() {
    val greetings = "\"Hello\"'"
    println(greetings)
}


// Math Operation
// addition
fun main() {
    val totalSum : Int = 200
    val debit : Int = 50
    println("Remaining amout is ksh.${totalSum - debit} Only.")
}

// subtruction and addition 
fun main(){
    val students : Int = 200
    val onTrip : Int = 20
    val backFromHome = 40
    print("Total students as on Monday = ${students - onTrip} and end of week were ${students + onTrip + backFromHome}")
}

// 

// Updating variables
/*
val -> used when you dont expect the value to change
var -> used when the value might change within the program
*/
fun main() {
    var age = 10
    age = 15
    println("five years later you grew to $age years")
}

fun main() {
    val unread = 10
    println("You have $unread unread Emails")
}

// Increament or decrement operators
fun main() {
    var unread = 10
    unread = unread + 1
    println("You have $unread unread Emails")  //-> 11 unread emails
}

// using the "Increament Operator"
fun main() {
    var unread = 10
    unread++
    println("You have $unread unread Emails") // --> 11 unread emails
}

// Decreament operator  
fun main() {
    var unread = 10
    unread--
    println("You have $unread unread Emails") // --> 9 unread emails
}


// COMMENTS
// commenets are either using forward slash 0r /* for long comments */

// FUNCTIONS
// uses the fun -> keyword to declare functions, name and paramenters then body
/*
    fun NAME(){
        BODY
    }
*/

// EX. 1
fun main() {
    greetings()
}
fun greetings(){
    println("Hello Timz")
    println("Hey Ninja")
}

// Return statements:
// by default return type is UNIT in kotlin,

fun hello() : String {
    println("Hello unit returns")
    return " Hello return statement"
}

// Return type of string 
fun main(){
    println(greetings())
}
fun greetings() : String {
    val name = "Timz"
    val age = "22"
    return "$name \n $age "
}


// Function and paramenters
/*
parameters are declared in the function brackets and 
arguements are passed while creating the function 
*/
fun main(){
    println(greetings("Jane"))
    println(greetings("Timz"))
}
fun greetings(name: String) : String {
    val name = "hello $name"
    val age = "you are 22 years old"
    return "$name \n $age "
}

// Multiple parameter functions
fun main(){
    println(greetings("Jane", 41))
    println(greetings("Timz",63))
}
fun greetings(name: String, age : Int) : String {
    val nameGreeting= "hello $name"
    val ageGreeting = "you are $age years old"
    return "$nameGreeting \n $ageGreeting "
}


// Named Arguements
fun main(){
    println(greetings(name="Timz", age = 22))
}
fun greetings(name : String, age : Int) : String {
    val nameGreeting= "hello $name"
    val ageGreeting = "you are $age years old"
    return "$nameGreeting \n $ageGreeting "
}


// Default arguements
fun main(){
    println(greetings())
}
fun greetings(name : String = "Owen", age : Int=25) : String {
    val nameGreeting= "hello $name"
    val ageGreeting = "you are $age years old"
    return "$nameGreeting \n $ageGreeting "
}

// Ex 2 ( specify one of them . the other picks a default value)
fun main(){
    println(greetings(name="Limz"))
}
fun greetings(name : String = "Owen", age : Int=25) : String {
    val nameGreeting= "hello $name"
    val ageGreeting = "you are $age years old"
    return "$nameGreeting \n $ageGreeting "
}

// Adding two numbers. 
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// Define add() function below this line
fun add(num1: Int, num2: Int) : Int{
    return num1 + num2
}

// 







