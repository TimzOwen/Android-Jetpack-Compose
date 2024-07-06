package classes

class Dog(val name: String, val breed: String, val age: Int = 0) {
    init {
        bark(name,breed)
    }

    private fun bark(name: String,breed: String) {
        println("$name is saying woof wooof !!")
    }
}