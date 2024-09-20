fun main() {
    val myCar = Car()
    println(myCar.color)
    println(myCar.model)
}

class Car{
    val color: String = "blue"
    val model: String = "bmw"
}


//
//
//
// Function in class
fun main() {
    val myCar = Car()
    println(myCar.drive())
}

class Car{
    val color: String = "blue"
    val model: String = "bmw"

    fun drive(){
        println("Driving south....")
    }
}


//
//
//
// property update of the car
fun main() {
    val myCar = Car()
    myCar.color = "white"
   myCar.model = "Subaru"
    println("car color ${myCar.color} model type ${myCar.model}")
}

class Car{
    var color: String = "blue"
    var model: String = "bmw"

    fun drive(){
        println("Driving south....")
    }
}


//
//
//
// default arguements 
fun main() {
    val myCar = Car()
    myCar.color = "white"
    myCar.model = "Subaru"
    println("car color ${myCar.color} model type ${myCar.model}")
}

class Car(color: String = "white", model: String = "Subaru") {
    var color: String = color
    var model: String = model

    fun drive(){
        println("Driving south....")
    }
}


//
//
//
// constructors parameters
fun main() {
    val myCar = Car()
    myCar.color = "white"
    println("car color ${myCar.color} model type ${myCar.model}")
}

class Car(color: String = "Red", var model: String = "Honda") {
    var color: String = "blue"

    fun drive(){
        println("Driving south....")
    }
}


//
//
//
// overwite default parameters
fun main() {
    val myCar = Car()
    myCar.color = "white"
    myCar.model = "Range Rover"
    println("car color ${myCar.color} model type ${myCar.model}")
}

class Car(color: String = "Red", var model: String = "Honda") {
    var color: String = "blue"

    fun drive(){
        println("Driving south....")
    }
}


//
//
//
// default args when instanting the object class
fun main() {
    val myCar = Car(color = "yellow", model = "honda")
    println("car color ${myCar.color} model type ${myCar.model}")
}

class Car(var color: String = "white", var model: String = "Subaru") {
    
    fun drive(){
        println("Driving south....")
    }
}

//
//
// 
// Init block -> always executed once
fun main() {
    val myCar = Car(color = "yellow", model = "honda")
    println("car color ${myCar.color} model type ${myCar.model}")
}

class Car(var color: String = "white", var model: String = "Subaru") {

    init {
        color = "maroon"
        model = "Gwagon"
    }
    fun drive(){
        print("Driving south....")
    }
}


//
//
//
// Multiple functions in class
fun main() {
    val myCar = Car(color = "yellow", model = "honda")
    myCar.maxSpeed(minSpeed = 80.0, maxSpeed = 205.9)
    println("car color ${myCar.color} model type ${myCar.model}")
}

class Car(var color: String = "white", var model: String = "Subaru") {

    init {
        color = "maroon"
        model = "Gwagon"
    }
    fun drive(){
        print("Driving south....")
    }
    fun maxSpeed(minSpeed: Double = 50.0, maxSpeed: Double=199.0){
        println("Current max speed $maxSpeed m/s and min speed $minSpeed")
    }
}
