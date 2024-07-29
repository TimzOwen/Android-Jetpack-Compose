fun main(){
    // Handling null exceptions
    val favouriteActor = null
    println(favouriteActor)
    

    //use {?} to assign nullable 
    var favouriteActor: String? = "Timz"
    println(favouriteActor)
    favouriteActor = null  // now re-assign to null and print
    println(favouriteActor)


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


    //Accessing methods of nullables {!!. --> not null assertion}
    var userName: String? = null    // throws error if it happens to be null
    println(userName!!.length)
    

    //Use Expression with else to check for nullability
    var favouriteActor: String? = null
    var lengthCharacters = if(favouriteActor != null){
    favouriteActor.length}
    else{
        0
    }
    println(lengthCharacters)


    //Use ELVIS Operator to handle nullability
    var favouriteActor: String? = null
    var lengthCharacters = favouriteActor?.length ?: 0
    
    println(lengthCharacters) // returns 0

}


