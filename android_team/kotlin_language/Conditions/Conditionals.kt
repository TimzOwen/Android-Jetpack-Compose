fun main(){
    
    // if else conditions with with multiple options
    val trafficLights = "Yellow"
    if(trafficLights == "Green"){
        println("Go")
    }else if (trafficLights == "Red"){
        println("Stop")
    }else if(trafficLights == "Yellow"){
        println("slow")
    }else{
        println("wrong input")
    }


    // Use When statements to switch conditions:
    val trafficLights = "jkbh"
    when(trafficLights){
        "Green" -> println("Go")
        "Red" -> println("Stop")
        "yellow" -> println("slow")
        else -> println("Error")
    }


    // When with multiple parameters
    val x = 3
    
    when(x){
       2 -> println("$x is a prime number between 1 and 10.")
       3 -> println("$x is a prime number between 1 and 10.")
       5 -> println("$x is a prime number between 1 and 10.")
       7 -> println("$x is a prime number between 1 and 10.")
       else -> println("$x is not a prime number between 1 and 10.")
       
    }


    // When with multiple parameters conditions
    val x = 6
    
    when(x){
       2,3,5,7 -> println("$x is a prime number between 1 and 10.")
       else -> println("$x is not a prime number between 1 and 10.")
    }


    // When with multiple parameters {using in for a range}
    val x = 6
    
    when(x){
       2,3,5,7 -> println("$x is a prime number between 1 and 10.")
       in 1..10 ->println("$x is a number between 1 and 10, but not a prime number.")
       else -> println("$x is not a prime number between 1 and 10.")
    }


    // When with multiple params {IS} keyword to check data type
    val x: Any = "gg"
    
    when(x){
       2,3,5,7 -> println("$x is a prime number between 1 and 10.")
       in 1..10 ->println("$x is a number between 1 and 10, but not a prime number.")
       is Int -> println("$x is an integer number, but not between 1 and 10.")
       else -> println("$x isn't an integer number")
    }

    //multiple condition for two conditions {TRAFFIC LIGHTS}
      val trafficLightColor = "Amber"

      when (trafficLightColor) {
          "Red" -> println("Stop")
          "Yellow", "Amber" -> println("Slow")
          "Green" -> println("Go")
          else -> println("Invalid traffic-light color")
      }

     // convert if else to CONDITIONS..... {Remove redundant println}
    val trafficLightColor = "Green"
    
    val message = 
    if (trafficLightColor == "Red") "stop"
    else if (trafficLightColor == "Yellow") "Slow" 
    else if (trafficLightColor == "Green") "Go" 
    else "Invalid input ... Error"
    
    println(message)


    // use expression on When statements
    val trafficLightColor = "Amber"

    val message =when (trafficLightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid traffic-light color"
    }
    
    println(message)


    

}