//import classes.Dog
//
//class Docs {
//
//    // documentation
//    fun main(){
//        // boolean state
//        val isMale = true
//        val isFemale = false
//
//        println(!isFemale)
//        println(isFemale)
//        println(isFemale && isMale)
//        println(isFemale || isMale)
//
//        // char
//        val userChar = 'a'
//        val userPie = "\u00AE" // copyright
//
//        println(userChar)
//        println(userPie)
//
//        // Strings
//        val userName = "TimzOwen"
//        val userRole = "user"
//        println("Hello ${userName.uppercase()}")
//        println(userRole)
//
//        // iterate in characters in string
//        for (num in userName){
//            println(num.uppercase())
//        }
//
//        // if else statements & user inputs
//        println("Enter your age...")
//        val userAge = readln().toInt()
//        if (userAge > 18) println("you can join the club") else println("you dont qualify")
//
//        //else if statements
//        println("Enter your age")
//        val userAge1 = readln().toInt()
//        if (userAge in 18..39) {
//            println("you can join the club")
//        }else if (userAge > 40){
//            println("you can't join my club")
//        }else{
//            println("you are underage son")
//        }
//
//        // Rock paper scissor shoe
//        var computerChoice = ""
//        println("Rock, Paper or Scissor......Enter one choice")
//        var userChoice = readln().toString()
//
//        val randomNumber = (1..3).random()
//        when (randomNumber) {
//            1 -> {
//                computerChoice = "Rock"
//            }
//            2 -> {
//                userChoice = "Paper"
//            }
//            else -> {
//                computerChoice = "Scissor"
//            }
//        }
//
//        val winner = when {
//            computerChoice == userChoice -> "Tie"
//            computerChoice == "Rock" && userChoice == "Paper" -> "Computer won"
//            computerChoice == "Paper" && userChoice == "Scissor" -> "Computer won"
//            computerChoice == "Scissor" && userChoice == "Rock" -> "computer won"
//            else -> "user won"
//        }
//
//        if (winner == "Tie") {
//            println("It's a tie")
//        }else if (winner == "Computer won") {
//            println("paper won")
//        }else println("user won!")
//
//        // Rock paper scissor shoe
//        var computerChoice1 = ""
//        println("Rock, Paper or Scissor......Enter one choice")
//        var userChoice1 = readln().toString()
//
//        val randomNumber1 = (1..3).random()
//        when (randomNumber) {
//            1 -> {
//                computerChoice = "Rock"
//            }
//            2 -> {
//                userChoice = "Paper"
//            }
//            else -> {
//                computerChoice = "Scissor"
//            }
//        }
//
//        val winner1 = when {
//            computerChoice == userChoice -> "Tie"
//            computerChoice == "Rock" && userChoice == "Paper" -> "Computer won"
//            computerChoice == "Paper" && userChoice == "Scissor" -> "Computer won"
//            computerChoice == "Scissor" && userChoice == "Rock" -> "computer won"
//            else -> "Player "
//        }
//
//        if (winner == "Tie") {
//            println("It's a tie")
//        }else println("$winner won!")
//
//        // While loops
//        var numCounter = 0
//        while (numCounter <= 5){
//            println("currently at $numCounter")
//            numCounter ++
//        }
//
//    }
//    // Functions
//
//    fun main(){
//        // call the function here
//        makeCoffee()
//    }
//
//    // create functions to be reused
//    fun makeCoffee(){
//        println("make coffee")
//        println("another coffee")
//    }
//
//    // Functions
//
//    fun main(){
//        // call the function here
//        makeCoffee(1, "Owen")
//        makeCoffee(0, "Abdul")
//        makeCoffee(3,"Timz")
//
//
//    }
//
//    // create functions to be reused
//    fun makeCoffee(sugarCount: Int, userName: String){
//        when(sugarCount){
//            0 -> println("Coffee with no sugar for $userName")
//            1 -> println("Coffee with $sugarCount tea spoon for $userName")
//            else -> println("Coffee with $sugarCount tea spoons for $userName")
//        }
//    }
//
//
//    fun main(){
//        // call the function here
//        println("Whose the coffee for? ")
//        val userName = readln()
//        println("How many tea spoons? ")
//        val spoonCounter = readln().toInt()
//
//        makeCoffee(spoonCounter, userName )
//
//
//    }
//
//    // create functions to be reused
//    fun makeCoffee(sugarCount: Int, userName: String){
//        when(sugarCount){
//            0 -> println("Coffee with no sugar for $userName")
//            1 -> println("Coffee with $sugarCount tea spoon for $userName")
//            else -> println("Coffee with $sugarCount tea spoons for $userName")
//        }
//    }
//
//
//
//    fun main() {
//
//        println("Choose between ROCK, PAPER or SCISSOR")
//        var computerInput = ""
//        val userInput = readln()
//        val compChoice = (1..3).random()
//
//        when(compChoice){
//            1 -> computerInput = "ROCK"
//            2 -> computerInput = "PAPER"
//            3 -> computerInput = "SCISSOR"
//        }
//
//        val winner = when{
//            computerInput == "ROCK" && userInput.toString() == "PAPER" -> "Computer won!"
//            computerInput == userInput -> "Its a tie"
//            computerInput == "SCISSOR"  && userInput== "ROCK" -> "Computer won!"
//            computerInput == "PAPER" && userInput == "SCISSOR" ->  "Computer won!"
//            else -> { " User won!" }
//        }
//
//        println(computerInput)
//
//        // RETURN TYPES FUNCTIONS
//        fun main(){
//            println("Enter num 1: ")
//            val num1 = readln().toInt()
//            println("Enter num2: ")
//            val num2 = readln().toInt()
//
//            println("The sum of $num1 + $num2 = " + addNumbers(num1,num2))
//
//        }
//
//        fun addNumbers(num1: Int, num2: Int): Int{
//            return num1 + num2
//        }
//
//    }
//
//    // DIVISION
//
//    fun main(){
//        println("Enter num 1: ")
//        val num1 = readln().toDouble()
//        println("Enter num2: ")
//        val num2 = readln().toDouble()
//
//        println("The sum of $num1 / $num2 = " + divisionNums(num1,num2))
//
//    }
//
//    fun divisionNums(num1: Double, num2: Double): Double{
//        return num1 / num2
//    }
//
//    // classes
//    package classes
//
//    class Dog {
//        init {
//            bark()
//        }
//
//        private fun bark(){
//            println("woof wooof !!")
//        }
//    }
//
//
//    fun main() {
//
//        var simba = classes.Dog()
//    }
//
//    CLASSES
//    package classes
//
//    class Dog(val name: String, val breed: String) {
//        init {
//            bark(name)
//        }
//
//        private fun bark(name: String){
//            println("$name is saying woof wooof !!")
//        }
//    }
//
//    fun main() {
//
//        var simba = Dog("simba","ushago")
//        println("${simba.name} is of breed ${simba.breed}")
//    }
//
//
//    //CLASSES DEFAULT VAULES
//    class Dog(val name: String, val breed: String, val age: Int = 0) {
//        init {
//            bark(name,breed)
//        }
//
//        private fun bark(name: String,breed: String) {
//            println("$name is saying woof wooof !!")
//        }
//    }
//
//    fun main() {
//
//        var simba = Dog("simba","ushago",4)
//        println("${simba.name} is of breed ${simba.breed} aged ${simba.age} years old")
//    }
//
//
//    //DATA CLASSES
//    // use data classes to simplify files not needed or called else where.
//    data class CoffeeDetails(
//        val sugarCount: Int,
//        val userName: String,
//        val size: String,
//        val creamAmount: Int
//    )
//
//    fun main() {
//
//        askCoffeeDetails()
//    }
//
//    fun askCoffeeDetails(){
//        println("whose coffee is it for? ...")
//        val userName = readln()
//        println("How many pieces of sugar?....")
//        val sugarCount = readln().toInt()
//        makeCoffee(userName, sugarCount)
//    }
//
//    fun makeCoffee(userName: String,sugarCount: Int){
//        when(sugarCount){
//            0 -> println("Coffee with no sugar for $userName")
//            1 -> println("Coffee with $sugarCount spoon for $userName")
//            else -> println("Coffee with $sugarCount spoons for $userName")
//        }
//    }
//
//    // DATA CLASSES
//    import classes.Dog
//
//    // use data classes to simplify files not needed or called else where.
//    data class CoffeeDetails(
//        val sugarCount: Int,
//        val userName: String,
//        val size: String,
//        val creamAmount: Int
//    )
//
//    fun main() {
//
//        val coffeeList = CoffeeDetails(2,"Timz","XL",4)
//        makeCoffee(coffeeList)
//    }
//
//    fun askCoffeeDetails(){
//        println("whose coffee is it for? ...")
//        val userName = readln()
//        println("How many pieces of sugar?....")
//        val sugarCount = readln().toInt()
//    }
//
//    fun makeCoffee(coffeeDetails: CoffeeDetails){
//        when(coffeeDetails.sugarCount){
//            0 -> println("Coffee with no sugar for ${coffeeDetails.userName} add cream: ${coffeeDetails.creamAmount} size ${coffeeDetails.size}")
//            1 -> println("Coffee with ${coffeeDetails.sugarCount} spoon for ${coffeeDetails.userName} add cream: ${coffeeDetails.creamAmount} size ${coffeeDetails.size}")
//            else -> println("Coffee with ${coffeeDetails.sugarCount} spoons for ${coffeeDetails.userName} add cream: ${coffeeDetails.creamAmount} size ${coffeeDetails.size}")
//        }
//    }
//
//
//}