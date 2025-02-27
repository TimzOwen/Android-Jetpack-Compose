
//////////
//////
/////
//// Generic types T ---> 

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



//////////
//////
/////
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


////////
/////
///
//
// DATA class

data class Question<T>(
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
    
    println(question1.toString())
    println(question2.answer)
    println(question1.difficulty)
}


/////
////
///
// Singleton ---> Classes that only need one instance to exist

object StudentProgress{
    val total: Int  = 10
    val current: Int = 5
}


fun main() {
    println("${StudentProgress.current}  0f ${StudentProgress.total} answered")
}


//////////
//////
/////
//
// Companion object - Singleton ---> Classes that only need one instance to exist

class Quiz{

    companion object StudentProgress{
        val total: Int  = 10
        val current: Int = 5

    }
}

fun main() {
    println("${Quiz.current}  0f ${Quiz.total} answered")
}



//////////
//////
/////
//
// property extension ---> Companion objects

class Quiz {
    companion object StudentProgress {
        val total: Int = 10
        val current: Int = 5

        val progressText: String
            get() = "${current} of ${total} answered"
    }
}

fun main() {
    // Access progressText directly from the companion object
    println(Quiz.progressText)
}



//////////
//////
/////
//
// extension function - companions

class Quiz {
    companion object StudentProgress {
        val total: Int = 10
        val current: Int = 5
    }
    
    fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(Quiz.progressText)
}
}

fun main() {
    Quiz.printProgressBar()
}