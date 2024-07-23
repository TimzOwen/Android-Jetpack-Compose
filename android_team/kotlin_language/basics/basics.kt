// Function declaration 
fun main(){
    println("Hello android")
}

// Function declaration ---> Call function more than once
fun main(){
    println("Hello android")
    println("Hello Androi!")
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


