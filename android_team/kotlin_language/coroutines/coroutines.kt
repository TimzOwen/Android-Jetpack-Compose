import kotlinx.coroutines.*
//Synchronous code
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


//
//
//
//
// check time taken for execution
import kotlin.system.*
import kotlinx.coroutines.*

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            println("Weather forecast")
            printForecast()
            printTemperature()
        }
    }
    println("Execution time: ${time / 1000.0} seconds")
}
suspend fun printForecast() {
    delay(1000)
    println("Sunny")
}

suspend fun printTemperature() {
    delay(1000)
    println("30\u00b0C")
} 




//
//
//
//
// Asynchronous code --> use launch
import kotlin.system.*
import kotlinx.coroutines.*

fun main() {
    val time = measureTimeMillis {
        runBlocking {
            println("Weather forecast")
            launch {
                printForecast()
            }
            launch {
                printTemperature()
            }
        }
    }
    println("Execution time: ${time / 1000.0} seconds")
}
    

suspend fun printForecast() {
    delay(1000)
    println("Sunny")
}

suspend fun printTemperature() {
    delay(1000)
    println("30\u00b0C")
} 


//
//
//
//
import kotlin.system.*
import kotlinx.coroutines.*

fun main() {
    runBlocking{
        println("Weather forecasting....")
        val forecast: Deferred<String> = async {
            getForeCast()
        }
        val temperature: Deferred<String> = async{
            getTemperature()
        }
        println("${forecast.await()} ${temperature.await()}")
        println("Cool temperatures")
    }
}

suspend fun getForeCast(): String {
    delay(1000)
    return "sunny"    
}

suspend fun getTemperature(): String{
    delay(1000)
    return "30\u00b0C"
}



//
//
//
// Combine coroutine scope
import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println("Weather forecast") 
        println(getWeatherReport())
        println("Have a good day!")
    }
}

suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async { getTemperature() }
    "${forecast.await()} ${temperature.await()}"
}

suspend fun getForecast(): String {
    delay(1000)
    return "Sunny"
}

suspend fun getTemperature(): String {
    delay(1000)
    return "30\u00b0C"
}

//
//
//
// 
// Exception handling
fun main() {
    runBlocking{
        println("Weather forecasting....")
        try{
           println(getWeather()) 
        }catch(e: AssertionError){
            println("There was exception $e")
        }
        println("Cool temperatures")
    }
}

suspend fun getWeather() = coroutineScope{
    val forecast = async { getForeCast() }
    val temperature = async { getTemperature() }
    "${forecast.await()} ${temperature.await()}"
}

suspend fun getForeCast(): String {   
    delay(500)
    throw AssertionError("invalid temperature")
    return "sunny"    
}

suspend fun getTemperature(): String{
    delay(1000)
    return "30\u00b0C"
}

//
//
//
//
import kotlinx.coroutines.*

fun main() {
    runBlocking {
        println("Weather forecast")
        println(getWeatherReport())
        println("Have a good day!")
    }
}

suspend fun getWeatherReport() = coroutineScope {
    val forecast = async { getForecast() }
    val temperature = async {
        try {
            getTemperature()
        } catch (e: AssertionError) {
            println("Caught exception $e")
            "{ No temperature found }"
        }
    }

    "${forecast.await()} ${temperature.await()}"
}

suspend fun getForecast(): String {
    delay(1000)
    return "Sunny"
}

suspend fun getTemperature(): String {
    delay(500)
    throw AssertionError("Temperature is invalid")
    return "30\u00b0C"
}