// Generic types T ---> 

class Question<T>(
    val question: String,
    val answer: T,
    val difficulty: String
)



fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    
    println(question1.question)
    println(question2.answer)
    println(question1.difficulty)
}


// Enum class ---> class used to rep values with limted values - in Caps
enum class Difficulty{
    HARD, EASY, MEDIUM
}



////
//
// ENUM 
// Generic types T ---> 

class Question<T>(
    val question: String,
    val answer: T,
    val difficulty: Difficulty
)



// Enum class ---> class used to rep values with limted values - in Caps
enum class Difficulty{
    HARD, EASY, MEDIUM
}


fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    
    println(question1.question)
    println(question2.answer)
    println(question1.difficulty)
}
