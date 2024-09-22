// 
//
//
// Inheritance
fun main() {
    val myCar = Car(color = "yellow", model = "honda")
    val truck = Truck(color = "blue", model = "izuzu")

    println("car color ${myCar.color} model type ${myCar.model}")
    println("Truck color ${truck.color} model type ${truck.model}")
    println("${truck.drive()}") // invoke method from car class
}

open class Car(var color: String = "white", var model: String = "Subaru") {
    fun drive(){
        print("Driving south....")
    }
    fun maxSpeed(minSpeed: Double = 50.0, maxSpeed: Double=199.0){
        println("Current max speed $maxSpeed m/s and min speed $minSpeed")
    }
}


class Truck(color: String,model: String): Car(color,model){

}


//
//
//
// Override methods
// default args
fun main() {
    val truck = Truck(color = "blue", model = "izuzu")

    println("${truck.drive()}") // invoke method from car class
    truck.maxSpeed()
}

open class Car(var color: String = "white", var model: String = "Subaru") {
    fun drive(){
        print("Driving south....")
    }
    open fun maxSpeed(minSpeed: Double = 50.0, maxSpeed: Double=199.0){
        println("Current max speed $maxSpeed m/s and min speed $minSpeed")
    }
}


class Truck(color: String,model: String): Car(color,model){
    override fun maxSpeed(minSpeed: Double, maxSpeed: Double) {
        val fullSpeed = minSpeed * maxSpeed
        println("Full speed for truck: $fullSpeed m/s and min speed $minSpeed")
    }
}