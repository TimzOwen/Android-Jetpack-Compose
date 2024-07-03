fun main() {
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
    }else println("$winner won!")


}
