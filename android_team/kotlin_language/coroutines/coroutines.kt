import kotlinx.coroutines.*

//
//
//
// Kotlin coroutines 
fun main() {
    runBlocking {      
        println("Before delays")
        delay(1000L)
        println("Executed after 1 second delay")
    }
}


//
//
//
// using suspend 
fun main() {
    runBlocking {            
        println("Weather Forest")
        printForest()
    }
}


suspend fun printForest(){
    delay(1000)
    println("sunny")
}


//
//
//
//
// more suspend functions 
fun main() {
    runBlocking {            
        println("Weather Forest")
        printForest()
        printTemperature()
    }
}

suspend fun printForest(){
    delay(1000)
    println("sunny")
}

suspend fun printTemperature(){
    delay(1000)
	println("30\u00b0C")
}