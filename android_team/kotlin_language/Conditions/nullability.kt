fun main(){
    // 
    // Handling null exceptions
    val favouriteActor = null
    println(favouriteActor)
    

    //use {?} to assign nullable on string types
    var favouriteActor: String? = "Timz"
    println(favouriteActor)
    favouriteActor = null  // now re-assign to null and print
    println(favouriteActor) // error -> non null value 

    fun main(){
        var loader: String? = "failed"
        println(loader)
        loader = null
        println(loader)
    }
    


    //use {?} to assign nullable 
    var age: Int? = 10
    println(age)
    age = null
    println(age)


    //Accessing methods of nullables {?.}
    var userName: String? = "Timz Owen"
    println(userName?.length)

    //Accessing methods of nullables {?.}
    var userName: String? = "Timz Owen"
    println(userName?.length)
    userName = null  // update and print
    println(userName?.length)

    fun main(){
        var loader: String? = "failed"
        println(loader?.length)
        loader=null
        println(loader?.length)
    }
    


    //Accessing methods of nullables {!!. --> not null assertion}
    var userName: String? = null    // throws error if it happens to be null
    println(userName!!.length)
    

    // use if else to check nullability conditions

    fun main(){
        var loader: String? = "thursday"
        if(loader != null){
            println("not null")
        }else{
            println("null")
        }
    
    }

    // ex 2
    fun main() {
        var favoriteActor: String? = null
    
        if(favoriteActor != null) {
          println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
        } else {
          println("You didn't input a name.")
        }
    }

    //Use Expression with else to check for nullability
    var favouriteActor: String? = null
    var lengthCharacters = if(favouriteActor != null){
    favouriteActor.length}
    else{
        0
    }
    println(lengthCharacters)

    //combine if else with when
    fun main() {
        var favoriteActor: String? = "Sandra Oh"
     
         val lengthOfName = if (favoriteActor != null) {
           favoriteActor.length
         } else {
           0
         }
     }

     fun main(){
        var loader: String? = "thursday"
        var lenghtLoader = if(loader != null){
            loader.length
        }else{
            0
        }
        
        println(lenghtLoader)
    
    }
    

    //Use ELVIS Operator to handle nullability
    var favouriteActor: String? = null
    var lengthCharacters = favouriteActor?.length ?: 0
    
    println(lengthCharacters) // returns 0

    // ex 2
    fun main(){
        var loader: String? = "thursday"
        var lenghtLoader = loader?.length ?: 0
        
        println(lenghtLoader)
    
    }

}


