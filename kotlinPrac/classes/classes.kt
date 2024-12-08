
// Arrays

fun arraysListDemo(){
    var riversArray = arrayOf("Nile", "Amazon", "Yangtze")
    
    riversArray += "Nairobi River" // creates a new array each time 
   
     for (i in riversArray){ 
        println(i)
    }
}



// compare arrays
fun arraysListDemo2(){
    var riversArray1 = arrayOf("Nile", "Amazon", "Yangtze")
    var riversArray2 = arrayOf("Nile", "Amazon", "Yangtze")
    
    riversArray1 += "Nairobi River" // creates a new array each time
   
     for (i in riversArray1){ 
        println(i)
    }
     
     println(riversArray1.contentEquals(riversArray2)) // compare arrays
}



// modification
fun arraysListDemoModification(){
    var riversArray = arrayOf(2,4,5)

   riversArray.shuffle()
    
    println(riversArray.joinToString())
    println(riversArray.toSet()) 
    println(riversArray.toList())

    val pairArray = arrayOf("apple" to 120, "banana" to 150, "cherry" to 90, "apple" to 140)
    println(pairArray.toMap())
}



//
fun arraysListDemoSets(){
	val pairArray = arrayOf("apple" to 120, "banana" to 150, "cherry" to 90,
                            "apple" to 140)
    for(items in pairArray)println(items)
    
    println(pairArray.toMap()) // apple is replaced by latest value update
}



// Order matters in class execution.
class initialDemo(name: String){
    val prop1 = "Username is: $name".also(::println)
    init{
        println("This is init block & prints: $name")
    }
    val prop2 = "lastname is: $name".also(::println)
    init{
        println("init block 2 also: prints $name")
    }
}