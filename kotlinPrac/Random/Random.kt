fun	main(){
    println(loopingWhen())
 }



 fun iterateCollections(){
    val fruits = listOf("Apple", "Banana", "Orange", "Grapes", 
                        "Mango", "Pineapple", "Strawberry")
    for(fruit in fruits){
        println(fruit)
    }
}


fun iterateCollectionsSetLambda(){
    val fruits = listOf("Apple", "Banana", "Orange", "Grapes", "Atush",
                        "Mango", "Pineapple", "Strawberry","Avocado")
   fruits
        .filter{it.startsWith("A")}
        .sortedBy{it}
        .map{it.uppercase()}
        .forEach{println(it)}                  
}


fun iterateCollectionsSet(){
    val fruits = setOf("Apple", "Banana", "Orange", "Grapes", 
                        "Mango", "Pineapple", "Strawberry")
    when{
        "Apple".lowercase() in fruits.map{it.lowercase()} -> println("Apple present")
        "mango".lowercase() in fruits.map{it.lowercase()} -> println("Mango present")
        "Banana" in fruits -> println("Banana present ")
        else -> println("Not available")
    }
   
}


fun iterateCollectionsWhen(){
    val fruits = listOf("Apple", "Banana", "Orange", "Grapes", 
                        "Mango", "Pineapple", "Strawberry")
    for(fruit in fruits){
        println(fruit)
    }
    
    if("Mango" in fruits) println("available")
    
    when{
        "Orange" in fruits -> println("Available")
        else -> println("Not available")
    }
}


 fun iterateOverRange(){
    for(i in 1..10){
        println(i)
    }
}

fun iterateRangeSteps(){
    for(x in 10 downTo 1){
        println(x)
    }
}

 fun testRange(){
    val x = 33
    val y = 10
    if(x in 1..y*4){
        println(x)
    }else
    println("Not in range")
}


 fun loopingWhen(){
    val day = 2
    val dayOfWeek = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        else -> "Incorrect"
    }
    print(dayOfWeek)
}
 
 fun loopingItems(){
     val fruits = listOf("banana","Orange","pineapple")
     var index = 0
     while(index < fruits.size){
         println("${fruits[index]} index: $index")
         index++
     }
 }
 
 
 fun whileLoops(){
     var a = 0
     while(a<=5){      
         println(a)  
           a++
     }
 }
 
 
 fun loopItems(){
     val fruits = listOf("banana","Orange","pineapple")
     for (i in fruits){
         println(i)
     }
 }
 
 
 fun returnGreatest(a: Int, b: Int): Int{
     return if(a>b) a else b
 }
 
 
 open class Shape
 
 class Rectangle(val height: Double, val length: Double): Shape(){
     val perimeter = height * length 
 }


 fun parseInt(strVal: String): Int?{
    return strVal.toIntOrNull()
}

fun nullSafetyCatch(num1: String, num2: String){
    
    val x = parseInt(num1)
    val y = parseInt(num2)
    
    if(x!=null && y!=null) {
        println (x * y)
    } else {
        println("$num1 or $num2 is not a number")
    }
}



fun typeCasting(obj: Any): Int?{
    if(obj !is String) return null
    return obj.length
}



fun typeCasting(obj: Any): Int?{
    
    if(obj !is String) return null
    return obj.length
    
    // Or
    if(obj is String && obj.length>0) return obj.length
    return null
}