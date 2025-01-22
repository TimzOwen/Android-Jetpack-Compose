
//
//
// polymorphism --> ability to take in more than one form

open class Animal{
    open fun sound(){
        println("some genenric animal sound")
    }
}

class Dog: Animal() {
    override fun sound(){
        print("back")
    }
}

fun main(){
    var animal = Dog()
    animal.sound()
}