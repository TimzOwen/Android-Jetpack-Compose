
//
//
// Classes and Objects {Practice Quiz}

// MOBILE NOTIFICATION
fun main() {
    val morningNotification = 51
    val eveningNotification = 135
    
    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if(numberOfMessages> 0 && numberOfMessages < 100){
        println("You have $numberOfMessages notifications.")
    }else if(numberOfMessages > 100){
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}




//
//
//
fun main() {
    val child = -9
    val adult = 28
    val senior = 87
    
    val isMonday = true
    
    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when{
        age in 0..12 -> 15
        age in 13..60 -> if(isMonday) 25 else 30
        age in 61..100 -> 20
        else -> -1
    }
}


//
//
//
fun main() {
    // Celsius to Fahrenheit
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { celsius ->
        9.0 / 5.0 * celsius + 32
    }

    // Kelvin to Celsius
    printFinalTemperature(350.0, "Kelvin", "Celsius") { kelvin ->
        kelvin - 273.15
    }

    // Fahrenheit to Kelvin
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin") { fahrenheit ->
        5.0 / 9.0 * (fahrenheit - 32) + 273.15
    }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}


// OR

fun main() {
    // Test the function with different conversions
    convertTemperature(27.0, "Celsius", "Fahrenheit")
    convertTemperature(350.0, "Kelvin", "Celsius")
    convertTemperature(10.0, "Fahrenheit", "Kelvin")
}

fun convertTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String
) {
    val finalMeasurement = when {
        // Celsius to Fahrenheit
        initialUnit.equals("Celsius", ignoreCase = true) && finalUnit.equals("Fahrenheit", ignoreCase = true) ->
            9.0 / 5.0 * initialMeasurement + 32

        // Kelvin to Celsius
        initialUnit.equals("Kelvin", ignoreCase = true) && finalUnit.equals("Celsius", ignoreCase = true) ->
            initialMeasurement - 273.15

        // Fahrenheit to Kelvin
        initialUnit.equals("Fahrenheit", ignoreCase = true) && finalUnit.equals("Kelvin", ignoreCase = true) ->
            5.0 / 9.0 * (initialMeasurement - 32) + 273.15

        // Unsupported conversion
        else -> {
            println("Unsupported conversion from $initialUnit to $finalUnit.")
            return
        }
    }

    // Format the final measurement to 2 decimal places
    val formattedMeasurement = String.format("%.2f", finalMeasurement)
    println("$initialMeasurement degrees $initialUnit is $formattedMeasurement degrees $finalUnit.")
}



//
//
//
//
class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    var playCount: Int
) {
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}

fun main() {
    val song1 = Song("Blinding Lights", "The Weeknd", 2020, 2000000)
    val song2 = Song("Unknown Melody", "New Artist", 2023, 500)

    song1.printDescription()
    println("Is popular? ${song1.isPopular}")

    song2.printDescription()
    println("Is popular? ${song2.isPopular}")
}


//or 

fun main() {
    val song1 = Song("Nakupenda","Timz","2000",1900)
    song1.songDescription()
    if(song1.isPopular) println("The song is popular") else "The song is unpopular"
}

class Song(val title: String, val artist: String, val year: String, var playCount: Int){
    
    val isPopular = if(playCount > 1000) true else false
    
    fun songDescription(){
        println("$title, performed by $artist, was released in $year published.")
       
    }
    
    
}



//
// INTERNET TASK
//
//
fun main() {    
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    
    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    val referral = if(referrer != null) "has a referer called ${referrer.name} ,who likes ${referrer.hobby}" else "Doesn't have a referrer."
    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        println("Likes to $hobby, $referral")
    }
}



//
//
//
//
open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }
    
    fun switchOff() {
        isScreenLightOn = false
    }
    
    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone: Phone(){
    
    var isPhoneFolded: Boolean = true
   
    
    override fun switchOn(){
        if(!isPhoneFolded){
            isScreenLightOn = true
        }
    }
    
    fun fold(){
        isPhoneFolded = true
        switchOff()
    }
   
    
    fun unfold(){
        isPhoneFolded = false
        switchOn()
    }
    
}

fun main() {
    val myPhone = FoldablePhone()

    myPhone.checkPhoneScreenLight() // off
    myPhone.switchOn()
    myPhone.checkPhoneScreenLight() // on

    myPhone.fold()
    myPhone.switchOn() // Should not turn on
    myPhone.checkPhoneScreenLight() // off

    myPhone.unfold()
    myPhone.switchOn()
    myPhone.checkPhoneScreenLight() // on
}


//
//
//
//
//
fun main() {
    val winningBid = Bid(5000, "Private Collector")
    
    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)
 
fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
   return bid?.amount ?: minimumPrice
}
