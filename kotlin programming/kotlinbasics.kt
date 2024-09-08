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



// Conditional statements
val time = 20
if(time<20){
    println("Good morning")
}else if(time>20){
    println("Good afternoon")
}else{
    println("Goodninght")
}





//Default arguements





// Arrays 


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


// For loop and arithemtics (With parameters)
fun main(){
    
    Calculate(1,50,3)
    
}

fun Calculate(first: Int, second: Int, dividerNumber: Int){
    
    for(i in first..second){
        if (i%dividerNumber == 0){
            println("$i is divisible with $dividerNumber")
        }
    }
    
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

// Return functions 
fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

// Define your displayAlertMessage() below this line.
fun displayAlertMessage(os : String, mail : String) : String{
    return "New os sign in $os on email Account $mail"
}




// variables in functions
fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
    println(displayAlertMessage(operatingSystem,emailId))
	println(displayAlertMessage())
}

// Define your displayAlertMessage() below this line..
fun displayAlertMessage(os : String = "unkown", mail : String="none") : String{
    return "New sign in $os on email account $mail"
}

// Boolean comparison
fun main() {
    println("Have I spent more time using my phone today: ${compareTime(300, 250)}")
    println("Have I spent more time using my phone today: ${compareTime(300, 300)}")
    println("Have I spent more time using my phone today: ${compareTime(200, 220)}")
}

fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

// similar
fun main(){
    println("I spend more time usinf my phone today: ${timeSpent(800, 700)}")
}
fun timeSpent(today: Int, yesterday: Int): Boolean{
    return today>yesterday
}



// Calories burn
fun main() {
    val Steps = 4000
    val caloriesBurned = pedometerStepsCounter(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories") 
}

fun pedometerStepsCounter(numOfSteps: Int): Double {
    val caloriesBurnEachStep = 0.04
    val totalCalBurn = numOfSteps * caloriesBurnEachStep
    return totalCalBurn
}

// Function grouping
// Remove the duplicate and create a simple function to do the same
fun main() {
    println("City: Ankara")
    println("Low temperature: 27, High temperature: 31")
    println("Chance of rain: 82%")
    println()

    println("City: Tokyo")
    println("Low temperature: 32, High temperature: 36")
    println("Chance of rain: 10%")
    println()
    
    println("City: Cape Town")
    println("Low temperature: 59, High temperature: 64")
    println("Chance of rain: 2%")
    println()
    
    println("City: Guatemala City")
    println("Low temperature: 50, High temperature: 55")
    println("Chance of rain: 7%")
    println()
}

// solution
fun main() {
    cityState("Nairobi",45, 70, 8)
    cityState("Nakuru",35, 75, 12)
}
fun cityState(name : String,lowT : Int, highT : Int, rain : Int){
    println("City : $name")
    println("Low Temperature: $lowT, High Temperature : $highT")
    println("Chance of rain: $rain%")
    println()
}



// Lambda expression
fun main(){          
    println(CalculateSalary(3,5000))    
}
fun CalculateSalary(days: Int, basic: Int): Int = days * basic



//
// Simplified lambda
fun main(){              
    val add: (Int, Int) -> Int = {a, b - > a + b}
    println(add(5,4))    
}


//
//
// Simplified lambda
fun main(){          
    println(calculateCatAge(5))
    
    val calcAge: (Int) -> Int = {age -> age * 7}
    println(calcAge(4))
}
fun calculateCatAge(age: Int): Int = age * 7 // Transform to lambda


// 
//
// Simplified lambda using it parameter (for only one parameter)
fun main(){                  
    val calcAge: (Int) -> Int = { it * 7}
    println(calcAge(4))
}


//
//
// Simplified lambda returning nothing (Void) --> transform to lambda
fun main(){                      
    println(showName("Timz"))
}

fun showName(name: String){
    println(name)
}


//
//
// Simplified lambda returning nothing (Void)
fun main(){                          
    val showName: (String) -> Unit = {name -> print(name)}
    showName("Owen")
}



//
//
// Simplified lambda returning nothing (Void) --> it 
fun main(){                          
    val showName: (String) -> Unit = {
        print(it)
    }
    showName("Owen")
}


//
//
// Simplified lambda returning nothing (Void) --> it 
fun main(){                          
    val showName: (String) -> Unit = {
        print("Hello my name is $it")
    }
    showName("Owen")
}



//
//
//
//Trailing lambda
fun main(){  
    enhancedMessage("He is "){add(4,2)}  // you can pass outside if last parameter if function
}

val add: (Int, Int) -> Int = {a,b -> a + b} // Lambda for adding

fun enhancedMessage(message: String, funAsParameter: () -> Int){
    println("$message ${funAsParameter()}")
}

//
//
//
//Trailing lambda (function with parameter)
fun main(){  
    enhancedMessage("He is "){
        println(it)
        add(4,2)
    }  // you can pass outside if last parameter if function
}

val add: (Int, Int) -> Int = {a,b -> a + b} // Lambda for adding

fun enhancedMessage(message: String, funAsParameter: (String) -> Int){
    println("$message ${funAsParameter("Hello")}")
}









// classes and objects 
/*
class -> is a blue print for objects
object--> is an instance of an object
*/



// Android Related topics
// working with layout 








