// classes {Declare and Call function and classes}
class SmartDevice{
    fun turnOn(){
        println("Tv is on....")
    }
    
    fun turnOff(){
        println("Tv is off....")
    }
}

fun main(){   
    val smartTvDevice = SmartDevice() //instantiate the object
    
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()    
}


// classes {PROPERTIES} & Parameter
class SmartDevice{
    val name = "Android Tv"
    var category = "entertainment"
    var deviceStatu ="Online.."
    
    fun turnOn(){
        println("smart device is turn on....")
    }
    
    fun turnOff(){
        println("smart device is off....")
    }
}


fun main(){   
    val smartTvDevice = SmartDevice() //instantiate the object
    println("${smartTvDevice.name} is here")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()    
}


// 