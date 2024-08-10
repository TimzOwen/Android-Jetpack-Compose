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
    
    println(solarSystem.size)  // Get total number of items 
    println(solarSystem[2])    // Access elements in a list
    println(solarSystem.get(1))  // access elements in a list
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("pluto"))  // access out of range give s-1
           
    // iterate thru a list
    for(plant in solarSystem){
        println(plant)
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
    
    solarSystem[1] = "PlanetOne"    // update existing element in list
    println(solarSystem)
    
    solarSystem.remove("planetOne")  // remove elements
    solarSystem.removeAt(0)    //  remove elements at specific index
    println(solarSystem)
    
    println(solarSystem.contains("Uranus"))  // check if it contains elements
    println("Mars" in solarSystem)   // check presence of an element
    
}