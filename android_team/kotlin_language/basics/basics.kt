// Function declaration 
fun main(){
    println("Hello android")
}


// Function declaration ---> Call function more than once
fun main(){
    println("Hello android")
    println("Hello Androi!")
}


// String concatenation
fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}


// return type functions
fun main(){
    println(returnFunction())
}

fun returnFunction(): String {
    val userName = "Timz"
    val fName = "Owen"
    
    return "$userName\n$fName"
}


// Return and parameter functions
fun main(){
    println(returnFunction(5))
}

fun returnFunction(age: Int): String {
    val userName = "Timz"
    val fName = "Owen"
    
    return "$userName\n$fName aged $age years old"
}


// Function Parameters
fun main() {
    val operatingSystem = "Chrome OS"
    val emailId = "sample@gmail.com"

    println(displayAlertMessage(operatingSystem, emailId))
}

// Define your displayAlertMessage() below this line.
fun displayAlertMessage(operatingSystem: String, emailId: String){
    println("There's a new sign-in request on $operatingSystem for your Google Account $emailId.")
}


// Multiple parameters
fun main(){
    println(returnFunction(5, 40000.5050))
}

fun returnFunction(age: Int, salary: Double): String {
    val userName = "Timz"
    val fName = "Owen"
    
    return "$userName\n$fName aged $age years old earning $salary"
}

// Multiple parameters functions
fun main() {
 
    println(cityTemperatures("Nairobi",30,40,7))
    println(cityTemperatures("Nairobi",3,20,2))
    println(cityTemperatures("Nairobi",25,50,90))
    
}

fun cityTemperatures(city: String, lowTemp: Int, highTemp: Int, chanceRain: Int){
    println("$city Low Temperature: $lowTemp, high Temperatures: $highTemp give a chance of: $chanceRain%")
   
}


// named arguements in functions
fun main(){
    println(returnFunction(age=5, salary=40000.5050))
    println(returnFunction(salary=4983489.49, age=50))
}

fun returnFunction(age: Int, salary: Double): String {
    val userName = "Timz"
    val fName = "Owen"
    
    return "$userName $fName aged $age years old earning $salary"
}


//Default arguements
fun main(){
    println(returnFunction(salary=40000.5050))
    println(returnFunction())
}

fun returnFunction(age: Int = 18, salary: Double=120000.50): String {
    val userName = "Timz"
    val fName = "Owen"
    
    return "$userName $fName aged $age years old earning $salary"
}



//
//
//
/// Funtions args
fun main(){

}

fun ReturnTypes(){
    
}