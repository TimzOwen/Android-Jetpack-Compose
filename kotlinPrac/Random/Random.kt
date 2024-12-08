fun	main(){
    println(loopingWhen())
 }
 
 fun loopingWhen(){
     
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