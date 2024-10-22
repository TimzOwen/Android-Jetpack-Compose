// Classes and Objects {Generics data types}
//Generics Data types

class FillInBlankQuestion(
    questionText: String, 
    answer: String,
    difficulty: String){
    
}

class TrueOrFalseQuestion(
    questionText: String, 
    answer: Boolean, 
    diffculty: String){
    
}

class NumericQuestion(
    questionText: String, 
    answer: Int,
    difficulty: String)

fun main() {
   
}

// Using generic types

class Questions<T>(
    val questionText: String,
    val answer: T,
    val diffculty: String
                  ){
    
}




//
//
// Classes and Objects {Generics data types}
//Generics Data types
class Questions<T>(
    
    val questionText: String,
    val answer: T,
    val diffculty: String
                  ){
    
}

fun main() {
   
    val q1 = Questions("Quesition one here", "answer", "easy")
    val q2 = Questions("New question",false,"hard")
    val q3 = Questions("Another",2,"difficuly")
    
    println(q1.answer)
    println(q2.questionText)
    println(q3.answer)
   
}



//
//
// Classes and Objects {ENUM CLASSES}}
//ENUMS Data types
class Questions<T>(
    
    val questionText: String,
    val answer: T,
    val diffculty: Difficulty){    
}

enum class Difficulty{
    EASY, MEDIUM, HARD
}

fun main() {
   
    val q1 = Questions("Quesition one here", "answer", Difficulty.EASY)
    val q2 = Questions("New question",false,Difficulty.MEDIUM)
    val q3 = Questions("Another",2,Difficulty.HARD)
    
    println(q1.answer)
    println(q2.questionText)
    println(q3.diffculty)
}



//
//
// Classes and Objects {Data CLASSES}}
// data classes
data class Questions<T>(
    val questionText: String,
    val answer: T,
    val diffculty: Difficulty){    
}

enum class Difficulty{
    EASY, MEDIUM, HARD
}

fun main() {
   
    val q1 = Questions("Quesition one here", "answer", Difficulty.EASY)
    val q2 = Questions("New question",false,Difficulty.MEDIUM)
    val q3 = Questions("Another",2,Difficulty.HARD)
    
    println(q1.answer)
    println(q2.toString())
    println(q3.toString())
}



//
//
// Classes and Objects {Use a singleton object}
// singleton classes --> use object to instantiate only one object at go
data class Questions<T>(
    val questionText: String,
    val answer: T,
    val diffculty: Difficulty){    
}

enum class Difficulty{
    EASY, MEDIUM, HARD
}

object StudentProgress{
    var total: Int =10
    var answered: Int = 5
}

fun main() {
   
    val q1 = Questions("Quesition one here", "answer", Difficulty.EASY)
    val q2 = Questions("New question",false,Difficulty.MEDIUM)
    val q3 = Questions("Another",2,Difficulty.HARD)
    
   println("${StudentProgress.answered} of ${StudentProgress.total} answered")
}





//
//
// Declare objects as companion objects
// You can define a singleton object inside another class using a companion object. 
data class Questions<T>(val questionText: String,val answer: T,
    val diffculty: Difficulty)  


enum class Difficulty{
    EASY, MEDIUM, HARD
}

class Quiz{
    val q1 = Questions("Quesition one here", "answer", Difficulty.EASY)
    val q2 = Questions("New question",false,Difficulty.MEDIUM)
    val q3 = Questions("Another",2,Difficulty.HARD)
    
    companion object StudentProgress{
    	var total: Int =10
    	var answered: Int = 3
	}
}



fun main() {    
   println("${Quiz.answered} of ${Quiz.total} answered")
}



//
//
// Add an extension property
// You can define a singleton object inside another class using a companion object. 
data class Questions<T>(val questionText: String,val answer: T,
    val diffculty: Difficulty)  


enum class Difficulty{
    EASY, MEDIUM, HARD
}

class Quiz{
    val q1 = Questions("Quesition one here", "answer", Difficulty.EASY)
    val q2 = Questions("New question",false,Difficulty.MEDIUM)
    val q3 = Questions("Another",2,Difficulty.HARD)
    
    companion object StudentProgress{
    	var total: Int =10
    	var answered: Int = 3 
        
        fun Quiz.StudentProgress.printProgressBar() {
            repeat(Quiz.answered) { print("▓") }
            repeat(Quiz.total - Quiz.answered) { print("▒") }
            println()
            println(Quiz.progressText)
}
	}
}

  val Quiz.StudentProgress.progressText: String
    get() = "${Quiz.answered} of ${Quiz.total} answered"




fun main() {    
    Quiz.printProgressBar()
}


//
//
//
// 
class Finder(private val list: List<String>){
    fun findItem(element: String, foundItem(element:String?) -> Unit){
        val itemFoundList = list.filter{
            it==element
        }
        if(itemFoundList.isNullOrEmpty()) foundItem(null) else
        	foundItem(itemFoundList.first())
    }
}


//
//
//
//
fun main() {
    val listOfItems = listOf("Timz","Owen","zuri","ninja")
    val finder = Finder(list = listOfItems)
    finder.findItem(element = "Timz"){ println("Found $it") }
}

class Finder(private val list: List<String>) {
    fun findItem(element: String, foundItem: (element: String?) -> Unit) {
        val itemFound = list.filter {
            it == element
        }
        if (itemFound.isNotEmpty()) {
            foundItem(itemFound.first())
        }
    }
}


//
//
//
// Generic T
fun main() {
    val listOfItems = listOf("Timz","Owen","zuri","ninja")
    val listOfNumbers = listOf(2,4,6,8,10)
    val finder = Finder(list = listOfNumbers)
    finder.findItem(element = 10){ println("Found $it") }
}

class Finder<T>(private val list: List<T>) {
    fun findItem(element: T, foundItem: (element: T?) -> Unit) {
        val itemFound = list.filter {
            it == element
        }
        if (itemFound.isEmpty()) foundItem(null) else {
            foundItem(itemFound.first())
        }
    }
}

//
//
//
// Enums - named list of constants
fun main() {
    val input = Result.SUCCESS
    getResult(result = input)
}

fun getResult(result: Result){
    return when(result){
        Result.SUCCESS -> println("success !")
        Result.ERROR -> println("Error")
        Result.FAILURE -> println("failed")
    }
}

enum class Result{
    SUCCESS,
    ERROR,
    FAILURE
}



//
//
//
//
// Enums - named list of constants
fun main() {
    Repository.startFetch()
    getResult(result = Repository.getCurrentState())
    Repository.finishedFetch()
    getResult(result = Repository.getCurrentState())
}

object Repository{
    private var loadState: Result = Result.IDLE
    private var dataFetched : String? = null

    fun startFetch(){
        loadState = Result.LOADING
        dataFetched = "data"
    }

    fun finishedFetch(){
        loadState = Result.SUCCESS
        dataFetched = null
    }

    fun getCurrentState() : Result{
        return loadState
    }
}

fun getResult(result: Result){
    return when(result){
        Result.SUCCESS -> println("success !")
        Result.ERROR -> println("Error")
        Result.FAILURE -> println("failed")
        Result.LOADING -> println("loading")
        Result.IDLE -> println("idle")
    }
}

enum class Result{
    SUCCESS,
    ERROR,
    FAILURE,
    LOADING,
    IDLE
}







//
//
//
//

