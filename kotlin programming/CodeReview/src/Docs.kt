class Docs {

    // documentation
    fun main(){
        // boolean state
        val isMale = true
        val isFemale = false

        println(!isFemale)
        println(isFemale)
        println(isFemale && isMale)
        println(isFemale || isMale)

        // char
        val userChar = 'a'
        val userPie = "\u00AE" // copyright

        println(userChar)
        println(userPie)

        // Strings
        val userName = "TimzOwen"
        val userRole = "user"
        println("Hello ${userName.uppercase()}")
        println(userRole)

        // iterate in characters in string
        for (num in userName){
            println(num.uppercase())
        }




    }

}