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





