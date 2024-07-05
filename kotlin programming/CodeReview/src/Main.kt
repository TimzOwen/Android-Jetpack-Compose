fun main() {

    println("Choose between ROCK, PAPER or SCISSOR")
    var computerInput = ""
    val userInput = readln()
    val compChoice = (1..3).random()

    when(compChoice){
        1 -> computerInput = "ROCK"
        2 -> computerInput = "PAPER"
        3 -> computerInput = "SCISSOR"
    }

    val winner = when{
        computerInput == "ROCK" && userInput.toString() == "PAPER" -> "Computer won!"
        computerInput == userInput -> "Its a tie"
        computerInput == "SCISSOR"  && userInput== "ROCK" -> "Computer won!"
        computerInput == "PAPER" && userInput == "SCISSOR" ->  "Computer won!"
        else -> { " User won!" }
    }

    println(computerInput)

}
