//Arrays
fun main() { 
    val rockPlanets = arrayOf("Mercury", "Venus","Earth","Neptune")
    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val solarSystem = rockPlanets + gasPlanets
    
    solarSystem[0] = "Satan"	// update value of an element in an array   
    println(solarSystem[0])   // Access elements of an array
    
    val newSolarSystem = arrayOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
    
} 



//
//
// Lists
//
fun main() { 
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    println(solarSystem.size)  // Get total number of items 
    println(solarSystem[2])    // Access elements in a list
    println(solarSystem.get(1))  // access elements in a list
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("pluto"))  // access out of range give s-1

} 



//
//
//Iterate thru items
//Lists
fun main() { 
    
    val solarSystem = listOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    println(solarSystem)  // GET the items of the list
    println(solarSystem.size)  // Get total number of items 
    println(solarSystem[2])    // Access elements in a list
    println(solarSystem.get(1))  // access elements in a list
    println(solarSystem.indexOf("Earth"))  // get the index of the element
    println(solarSystem.indexOf("pluto"))  // access out of range give s-1
           
    // iterate thru a list
    for(plant in solarSystem){
        println(plant)
    }

    // iterate with for each
    solarSystem.forEach{
        println("planet Name: $it")
    }

} 


//
//
//
//
//
//
//MUTABLE LIST OF
fun main(){
    
    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
     
    solarSystem.add("newPlanet")   // add item
    solarSystem.add(3, "Satan")    // add at specific index
    solarSystem.add(Venus)  // you add mutiple similar items 
    
    solarSystem[1] = "PlanetOne"    // update existing element in list
    println(solarSystem)
    
    solarSystem.remove("planetOne")  // remove elements
    solarSystem.removeAt(0)    //  remove elements at specific index
    println(solarSystem)
    
    println(solarSystem.contains("Uranus"))  // check if it contains elements
    println("Mars" in solarSystem)   // check presence of an element
        
}

//
//
//
// Empty collections
val empty = emptyList<String>()  // create an empty collection of String objects
val empty = emptySet<Int>()  // create an empty collection of String objects
val empty = emptyMap<String,String>()  // create an empty collection of String objects


//
//
//
// Collection filters
val listOfNames = listOf("James","Shem","Timz","Mike","Owen","Jude")

println(listOfNames[1])
if ("Shem" in listOfNames) println("Yes") // if check
println("Timz" in listOfNames) // Boolean

// create a new list based on items present
val newList = listOfNames.filter{
    it == "Timz"
}
// create a new list based on items present
val newList = listOfNames.filter{
    it.length > 4 // return new list with items more than 4 characters
}
val newList = listOfNames.filter{
    it.endsWith("e") // character ending 
}
val newList = listOfNames.filter{
    it.startsWith("M",ignoreCase=true) // character starting with 
}
val newList = listOfNames.filter{
    it.startsWith("M", ignoreCase = true) &&  // Nest more commands
            it.endsWith("e",ignoreCase = true)
} 
println(newList)



//
//
//
// Collections in Kotlin {sets}

fun main() {

    // immutable set of elements
    val solarSystem = setOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem.add() // Doesnt allow you to add any item as its immutable
    println(solarSystem)

    //mutable set collection
    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")
    solarSystem.add("Pluto")  // add element to set
    solarSystem.add("pluto")   // adding existing element doesn't throw error but ignores 
    println(solarSystem.contains("Pluto"))  // check if item is present in the set
    solarSystem.remove("Pluto")  // remove element from set
    println(solarSystem.size)   // check size of the set
    
}



//
//
//
// Collections in Kotlin {maps --> Key - value pair}
fun main() {
    val solarSystemImmutable = mapOf(
        "Mercury" to 0,
        "Venus" to 1)  // Immmutable map of elements

    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14)
        
    solarSystem["pluto"] = 9    // add element to set
    println(solarSystem["Pluto"]) // check index of element
    println(solarSystem.keys )// Get all the keys only
    println(solarSystem.values) // Get values only
    solarSystem.remove("Pluto")  // remove element
    println(solarSystem.get("Theia"))  // use get to access element
    solarSystem["Jupiter"] = 78	    // update element index
	println(solarSystem["Jupiter"])  
    if ("pluto" in solarSystem) println("Yes") // check if element is available
    if (6 in solarSystem.values) println("Yes") // check value availability in map
    println(solarSystem.size)  // check no. of elements

    
}



//
//
//
// forEach() and string templates with lambdas

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut", 
        softBaked = true, 
        hasFilling = false, 
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {
    
    // use for each to loop thru items 
    cookies.forEach(){
        println("Menu item: ${it.name}")
    }

}




//
//
//
// maps ---> map different data type to your desire

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut", 
        softBaked = true, 
        hasFilling = false, 
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {
    

  println("Full menu: ")  
  val fullMenu = cookies.map{
      "${it.name} -- $${it.price}"
  }
  
  fullMenu.forEach{
      println(it)
  }

}




//
//
//
// filter()
// The filter() function lets you create a subset of a collection. 

class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut", 
        softBaked = true, 
        hasFilling = false, 
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)

fun main() {
    

  println("soft baked: ")  
  val softBaked = cookies.filter{
      it.softBaked
  }
  
  
  softBaked.forEach{
      println("${it.name} -- $${it.price}")
  }

}

























