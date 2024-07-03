class Docs {

    // documentation
    fun main(){
        // boolean state
        val isMale = true
        val isFemale = false

        println(!isFemale)
        println(isFemale)
        println(isFemale && isMale)
        println(isFemale || isMale)

        // char
        val userChar = 'a'
        val userPie = "\u00AE" // copyright

        println(userChar)
        println(userPie)

        // Strings
        val userName = "TimzOwen"
        val userRole = "user"
        println("Hello ${userName.uppercase()}")
        println(userRole)

        // iterate in characters in string
        for (num in userName){
            println(num.uppercase())
        }

        // if else statements & user inputs
        println("Enter your age...")
        val userAge = readln().toInt()
        if (userAge > 18) println("you can join the club") else println("you dont qualify")

        //else if statements
        println("Enter your age")
        val userAge1 = readln().toInt()
        if (userAge in 18..39) {
            println("you can join the club")
        }else if (userAge > 40){
            println("you can't join my club")
        }else{
            println("you are underage son")
        }

        // Rock paper scissor shoe
        var computerChoice = ""
        println("Rock, Paper or Scissor......Enter one choice")
        var userChoice = readln().toString()

        val randomNumber = (1..3).random()
        when (randomNumber) {
            1 -> {
                computerChoice = "Rock"
            }
            2 -> {
                userChoice = "Paper"
            }
            else -> {
                computerChoice = "Scissor"
            }
        }

        val winner = when {
            computerChoice == userChoice -> "Tie"
            computerChoice == "Rock" && userChoice == "Paper" -> "Computer won"
            computerChoice == "Paper" && userChoice == "Scissor" -> "Computer won"
            computerChoice == "Scissor" && userChoice == "Rock" -> "computer won"
            else -> "user won"
        }

        if (winner == "Tie") {
            println("It's a tie")
        }else if (winner == "Computer won") {
            println("paper won")
        }else println("user won!")

        // Rock paper scissor shoe
        var computerChoice1 = ""
        println("Rock, Paper or Scissor......Enter one choice")
        var userChoice1 = readln().toString()

        val randomNumber1 = (1..3).random()
        when (randomNumber) {
            1 -> {
                computerChoice = "Rock"
            }
            2 -> {
                userChoice = "Paper"
            }
            else -> {
                computerChoice = "Scissor"
            }
        }

        val winner1 = when {
            computerChoice == userChoice -> "Tie"
            computerChoice == "Rock" && userChoice == "Paper" -> "Computer won"
            computerChoice == "Paper" && userChoice == "Scissor" -> "Computer won"
            computerChoice == "Scissor" && userChoice == "Rock" -> "computer won"
            else -> "Player "
        }

        if (winner == "Tie") {
            println("It's a tie")
        }else println("$winner won!")

        // While loops
        var numCounter = 0
        while (numCounter <= 5){
            println("currently at $numCounter")
            numCounter ++
        }

    }

}