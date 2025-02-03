//
//
//
// hold data
fun main() {
    val person = Person(firstName = "Timz", lastName = "Owe",35)
    println(person)

}

data class Person(val firstName: String, val lastName: String, val age: Int)


//
//
//
// 
//
fun main() {
    val person = Person(firstName = "Timz", lastName = "Owen",35)
    val person2 = Person(firstName = "Mike", lastName = "James",20)
    val person3 = Person(firstName = "Ronald", lastName = "Mwangi",15)

    val listOfPersons = listOf(person, person2, person3) // convert to list

    // iterate the items
    listOfPersons.forEach {
        println(it.age)
    }


}

data class Person(val firstName: String, val lastName: String, val age: Int)