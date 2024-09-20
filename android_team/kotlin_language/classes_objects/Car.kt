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
// constructors arguements
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
// overwite default arguements
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