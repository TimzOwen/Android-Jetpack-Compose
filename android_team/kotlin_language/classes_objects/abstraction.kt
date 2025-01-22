//
// abstration - hinding the implementation logic and 
// displaying functionality only
//
abstract class Shape{
    abstract fun area(): Double
}

class Circle(val radius: Double) : Shape() {
    override fun area() = 3.14 * radius * radius
}

fun main(){
    val circle = Circle(14.0)
    println("area: ${circle.area()}")
}


// 
//
//
// Interface abstraction
interface  Drawable{
    fun draw()
}

class Circle : Drawable {
    override fun draw(){
        println("drawing a circle")
    }
}

fun main(){
    val circle = Circle()
    circle.draw()
}