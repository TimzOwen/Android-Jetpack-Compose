// classes {Declare and Call function and classes}
class SmartDevice{
    fun turnOn(){
        println("Tv is on....")
    }
    
    fun turnOff(){
        println("Tv is off....")
    }
}

fun main(){   
    val smartTvDevice = SmartDevice() //instantiate the object
    
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()    
}


// classes {PROPERTIES} & Parameter
class SmartDevice{
    val name = "Android Tv"
    var category = "entertainment"
    var deviceStatu ="Online.."
    
    fun turnOn(){
        println("smart device is turn on....")
    }
    
    fun turnOff(){
        println("smart device is off....")
    }
}


fun main(){   
    val smartTvDevice = SmartDevice() //instantiate the object
    println("${smartTvDevice.name} is here")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()    
}


 // constructors {with primary and secondary constructor}
class DeviceStatus(name: String, category: String){
    var deviceStatus = "online"
    
    constructor(name: String, category: String, status: Int): this(name, category)
    deviceStatus = when(status){
        0 -> "Offline"
        1 -> "Online"
        else -> "unknown"
    }
    
}



// class METHODS
class SmartDevice{
    
    // member function / method
    fun turnOn(){
        println("Smart device is turned on....")
    }
    
    fun turnOff(){
        println("Smart device is turned off...")
    }
}
 
// create instance and call the member function in MAIN function
fun main(){
    
    val smartTvDevice = SmartDevice()
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()    
}


//
// classe PROPERTIES
class SmartDevice{
    //property
    val name = "android TV"
    
    // member function / method
    fun turnOn(){
        println("Smart device is turned on....")
    }
    
    fun turnOff(){
        println("Smart device is turned off...")
    }
}
 
// create instance and call the member function in MAIN function
fun main(){
    
    val smartTvDevice = SmartDevice()
    println("Device name: ${smartTvDevice.name}")  // access property here
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()    
}



// Backing Field --> Holde memory for getter and setter
var speakerVolume = 2
get() = field
set(value){
    field = value
}

// example 2
var speakerVolume = 5
set(value){
    if(value in 0..100){
        field = value
    }
}



//
// classes parameterized CONSTRUCTOR Definition
class SmartDevice constructor(val name: String, val category: String){ 
    val name = "android TV"
   
    fun turnOn(){
        println("Smart device is turned on....")
    }
    
    fun turnOff(){
        println("Smart device is turned off...")
    }
}
 
fun main(){
    
    val smartTvDevice = SmartDevice(name="androidTv", category="entertainment") // named arguements
    val smartWatchDevices = SmartDevice("smartWatch","time") // no named arguements
    println("Device name: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()    
}


//
// PRIMARY & SECONDARY Constructors
class SmartDevice(val name: String, val category: String){
    var deviceStatus = "online"
    
    constructor(name: String, category: String, statusCode: Int) : this(name, category){ // secondary 
    deviceStatus = when(statusCode){
        1 -> "online"
        0 -> "offline"
        else -> "unknown"
     }
    }
    
    fun turnOn(){
        println("smart device is on...")
    }
    
    fun turnOff(){
        println("smart device is off...")
    }
    
}

fun main(){
    val device1 = SmartDevice("android","entertainmet",0)
    println(device1.deviceStatus)
    device1.turnOn()
}


//
// RELATIONSHIP between CLASSES {INHERITANCE} (open - make it extendable)
open class SmartDevice(val name: String, val category: String){
    var deviceStatus = "online"
    
    constructor(name: String, category: String, statusCode: Int) : this(name, category){ // secondary 
    deviceStatus = when(statusCode){
        1 -> "online"
        0 -> "offline"
        else -> "unknown"
     }
    }
    
    fun turnOn(){
        println("smart device is on...")
    }
    
    fun turnOff(){
        println("smart device is off...")
    }
    
}


//
// RELATIONSHIP between CLASSES {INHERITANCE} (open - make it extendable)
open class SmartDevice(val name: String, val category: String){
    var deviceStatus = "online"
    
    constructor(name: String, category: String, statusCode: Int) : this(name, category){ // secondary 
    deviceStatus = when(statusCode){
        1 -> "online"
        0 -> "offline"
        else -> "unknown"
     }
    }
    
    fun turnOn(){
        println("smart device is on...")
    }
    
    fun turnOff(){
        println("smart device is off...")
    }
    
}


//
// Inherit behaviour of our super open super class
class SmartTvDevice(deviceName: String, deviceCategory: String) : SmartDevice(name=deviceName, category=deviceCategory){
    // add a property
    var speakerVolume = 2
    set(value){
        if(value in 0..100){
            field = value
        }
    }
    
    var channelNumber = 4
    set(value){
        if(value in 0..200){
            field = value
        }
    }
    
    fun increaseSpeakerVolume(){
        speakerVolume ++
        println("Speaker volume inreased to $speakerVolume")
    }
    
    fun nextChannel(){
        channelNumber ++
        println("Channel number changed to $channelNumber")
    }
    
}

fun main(){
    val device1 = SmartDevice("android","entertainmet",0)
    println(device1.deviceStatus)
    device1.turnOn()
    println()
    
    val smartTvDevice = SmartTvDevice("smartTv","Entertainmet")
    smartTvDevice.increaseSpeakerVolume()
    
    
}



//
// RELATIONSHIP between CLASSES {INHERITANCE} (open - make it extendable) || Relationship 
open class SmartDevice(val name: String, val category: String){
    var deviceStatus = "online"
    
    constructor(name: String, category: String, statusCode: Int) : this(name, category){ // secondary 
    deviceStatus = when(statusCode){
        1 -> "online"
        0 -> "offline"
        else -> "unknown"
     }
    }
    
    fun turnOn(){
        println("smart device is on...")
    }
    
    fun turnOff(){
        println("smart device is off...")
    }
    
}

// Inherit behaviour of our super open super class
class SmartTvDevice(deviceName: String, deviceCategory: String) : SmartDevice(name=deviceName, category=deviceCategory){
    // add a property
    var speakerVolume = 2
    set(value){
        if(value in 0..100){
            field = value
        }
    }
    
    var channelNumber = 4
    set(value){
        if(value in 0..200){
            field = value
        }
    }
    
    fun increaseSpeakerVolume(){
        speakerVolume ++
        println("Speaker volume inreased to $speakerVolume")
    }
    
    fun nextChannel(){
        channelNumber ++
        println("Channel number changed to $channelNumber")
    }
    
}

// smartlight to inherit from SmartDevice
class SmartLightDevice(deviceName: String, deviceCategory: String) : SmartDevice(name=deviceName, category=deviceCategory){
    
    var brightnessLevel = 5
    set(value){
        if(value in 0..100){
            field=value
        }
    }
    
    fun increaseBrightness(){
        brightnessLevel ++
        println("brightness level increased to: $brightnessLevel")
    }
    
}

// class Relationship - composition
class SmartHome(
    val smartTvDevice : SmartTvDevice,
    val smartLightDevice: SmartLightDevice){
    
    fun turnOnTv(){
        smartTvDevice.turnOn()       
    }
    
    fun turnOnLight(){
        smartLightDevice.turnOn()
    }
    
    fun turnOffTv(){
        smartTvDevice.turnOff()
    }
    
    fun turnOffLight(){
        smartLightDevice.turnOff()
    }
    
    fun increaseTvVolume(){
        smartTvDevice.increaseSpeakerVolume()
    }
    
    fun increaseBrightness(){
        smartLightDevice.increaseBrightness()
    }
    
    fun changeTvChannel(){
        smartTvDevice.nextChannel()
    }
    
    fun turnOffAllDevices(){
        turnOffLight()
        turnOffTv()
    }
    
}

fun main(){
    val device1 = SmartDevice("android","entertainmet",0)
    println(device1.deviceStatus)
    device1.turnOn()
    println()
    
    val smartTvDevice = SmartTvDevice("smartTv","Entertainmet")
    smartTvDevice.increaseSpeakerVolume()
    println()
    
    val smartLight = SmartLightDevice("smartlight", "lighting")
    smartLight.increaseBrightness()
    println()
    
  
}




//
//
// RELATIONSHIP between CLASSES {OVERRIDE} --> open to allow override
open class SmartDevice(val name: String, val category: String){
    var deviceStatus = "online"
    
    constructor(name: String, category: String, statusCode: Int) : this(name, category){ // secondary 
    deviceStatus = when(statusCode){
        1 -> "online"
        0 -> "offline"
        else -> "unknown"
     }
    }
    
    open fun turnOn(){
        println("smart device is on...")
    }
    
    open fun turnOff(){
        println("smart device is off...")
    }
    
}

// Inherit behaviour of our super open super class
class SmartTvDevice(deviceName: String, deviceCategory: String) : SmartDevice(name=deviceName, category=deviceCategory){
    // add a property
    var speakerVolume = 2
    set(value){
        if(value in 0..100){
            field = value
        }
    }
    
    var channelNumber = 4
    set(value){
        if(value in 0..200){
            field = value
        }
    }
    
    fun increaseSpeakerVolume(){
        speakerVolume ++
        println("Speaker volume inreased to $speakerVolume")
    }
    
    fun nextChannel(){
        channelNumber ++
        println("Channel number changed to $channelNumber")
    }
    
    override fun turnOn() {
        deviceStatus = "on"
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                "set to $channelNumber." )
    }
    
    override fun turnOff() {
        deviceStatus = "off"
        println("$name turned off")
    }
    
}

// smartlight to inherit from SmartDevice
class SmartLightDevice(deviceName: String, deviceCategory: String) : SmartDevice(name=deviceName, category=deviceCategory){
    
    var brightnessLevel = 5
    set(value){
        if(value in 0..100){
            field=value
        }
    }
    
    fun increaseBrightness(){
        brightnessLevel ++
        println("brightness level increased to: $brightnessLevel")
    }
    
    override fun turnOn(){
        deviceStatus = "on"
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")        
    }
    
     override fun turnOff() {
        deviceStatus = "off"
        brightnessLevel = 0
        println("Smart Light turned off")
    }
}

// class Relationship - composition
class SmartHome(
    val smartTvDevice : SmartTvDevice,
    val smartLightDevice: SmartLightDevice){
    
    fun turnOnTv(){
        smartTvDevice.turnOn()       
    }
    
    fun turnOnLight(){
        smartLightDevice.turnOn()
    }
    
    fun turnOffTv(){
        smartTvDevice.turnOff()
    }
    
    fun turnOffLight(){
        smartLightDevice.turnOff()
    }
    
    fun increaseTvVolume(){
        smartTvDevice.increaseSpeakerVolume()
    }
    
    fun increaseBrightness(){
        smartLightDevice.increaseBrightness()
    }
    
    fun changeTvChannel(){
        smartTvDevice.nextChannel()
    }
    
    fun turnOffAllDevices(){
        turnOffLight()
        turnOffTv()
    }
    
}

fun main(){
    val device1 = SmartDevice("android","entertainmet",0)
    println(device1.deviceStatus)
    device1.turnOn()
    println()
    
    val smartTvDevice = SmartTvDevice("smartTv","Entertainmet")
    smartTvDevice.increaseSpeakerVolume()
    println()
    
    val smartLight = SmartLightDevice("smartlight", "lighting")
    smartLight.increaseBrightness()
    println()
    
    var smartDevice: SmartDevice = SmartTvDevice("Android TV", "Entertainment")
    smartDevice.turnOn()
    println()
    
    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()
}



//
//
// RELATIONSHIP between CLASSES {super} Resue super class
open class SmartDevice(val name: String, val category: String){
    var deviceStatus = "online"
    open val deviceType = "unknown"    //override superclass property
    
    constructor(name: String, category: String, statusCode: Int) : this(name, category){ // secondary 
    deviceStatus = when(statusCode){
        1 -> "online"
        0 -> "offline"
        else -> "unknown"
     }
    }
    
    open fun turnOn(){
        deviceStatus = "on"
    }
    
    open fun turnOff(){
        deviceStatus = "off"
    }
    
}

// Inherit behaviour of our super open super class
class SmartTvDevice(deviceName: String, deviceCategory: String) : SmartDevice(name=deviceName, category=deviceCategory){
    
    override val deviceType = "Smart TV"  // overrride the value
    
    var speakerVolume = 2
    set(value){
        if(value in 0..100){
            field = value
        }
    }
    
    var channelNumber = 4
    set(value){
        if(value in 0..200){
            field = value
        }
    }
    
    fun increaseSpeakerVolume(){
        speakerVolume ++
        println("Speaker volume inreased to $speakerVolume")
    }
    
    fun nextChannel(){
        channelNumber ++
        println("Channel number changed to $channelNumber")
    }
    
    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                "set to $channelNumber." )
    }
    
    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }
    
}

// smartlight to inherit from SmartDevice
class SmartLightDevice(deviceName: String, deviceCategory: String) : SmartDevice(name=deviceName, category=deviceCategory){
    
    override val deviceType = "Smart Light"
    
    var brightnessLevel = 5
    set(value){
        if(value in 0..100){
            field=value
        }
    }
    
    fun increaseBrightness(){
        brightnessLevel ++
        println("brightness level increased to: $brightnessLevel")
    }
    
    override fun turnOn(){
        super.turnOn()
        brightnessLevel = 2
        println("$name turned on. The brightness level is $brightnessLevel.")        
    }
    
     override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("Smart Light turned off")
    }
}

// class Relationship - composition
class SmartHome(
    val smartTvDevice : SmartTvDevice,
    val smartLightDevice: SmartLightDevice){
    
    fun turnOnTv(){
        smartTvDevice.turnOn()       
    }
    
    fun turnOnLight(){
        smartLightDevice.turnOn()
    }
    
    fun turnOffTv(){
        smartTvDevice.turnOff()
    }
    
    fun turnOffLight(){
        smartLightDevice.turnOff()
    }
    
    fun increaseTvVolume(){
        smartTvDevice.increaseSpeakerVolume()
    }
    
    fun increaseBrightness(){
        smartLightDevice.increaseBrightness()
    }
    
    fun changeTvChannel(){
        smartTvDevice.nextChannel()
    }
    
    fun turnOffAllDevices(){
        turnOffLight()
        turnOffTv()
    }
    
}

fun main(){
    val device1 = SmartDevice("android","entertainmet",0)
    println(device1.deviceStatus)
    device1.turnOn()
    println()
    
    val smartTvDevice = SmartTvDevice("smartTv","Entertainmet")
    smartTvDevice.increaseSpeakerVolume()
    println()
    
    val smartLight = SmartLightDevice("smartlight", "lighting")
    smartLight.increaseBrightness()
    println()
    
    var smartDevice: SmartDevice = SmartTvDevice("Android TV", "Entertainment")
    smartDevice.turnOn()
    println()
    
    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()
    
  
}




//
//
// Classes & Objects LAMBDAs  {expression} as variables
fun main(){
    
    val trickFunction = ::trick // use full colon to store the fn as vairable
    
}

fun trick(){
    println("No treats")
}



//
//
// Classes & Objects  {expression} --> Convert to lambda function
fun main(){    
    val trickFunction = trick // 
    trick()
    trickFunction()
    
}

// use lambda expression
val trick = {
    println("No treats")
}




//
//
// Functions as data type {RETURN TYPES}
fun main(){    
    
    trick()
    treat()
    
}

// use lambda expression
val trick = {
    println("No tricks!")
}

// fn with parameters and return type
val treat: () -> Unit = {
    println("No treats!")
}




//
//
// Functions as data type & Return type of function
fun main(){
    val trickFunction = trickOrTreat(true)
    val treatFunction = trickOrTreat(false)
    trickFunction()
    treatFunction()
    
}

fun trickOrTreat(isTrick: Boolean): () -> Unit {
    if(isTrick){
        return trick
    }else{
        return treat
    }   
}


// use lambda expression
val trick = {
    println("No tricks!")
}

// fn with parameters and return type
val treat: () -> Unit = {
    println("No treats!")
}




//
//
// pass a function to anther function as args to fn {FUNCTION AS PARAMETES}
fun main(){
    
    val coins: (Int) -> String = { quantity -> 
    "$quantity quaters"
    }
    
    val cupcake: (Int) -> String = {
        "have a cupcake"
        
    }
    
    val trickFunction = trickOrTreat(true, cupcake)
    val treatFunction = trickOrTreat(false, coins)
    trickFunction()
    treatFunction()
    
}

fun trickOrTreat(isTrick: Boolean, extraTreat:(Int) -> String): () -> Unit {
    if(isTrick){
        return trick
    }else{
        println(extraTreat(5))
        return treat
    }   
}


// use lambda expression
val trick = {
    println("No tricks!")
}

// fn with parameters and return type
val treat: () -> Unit = {
    println("No treats!")
}





//
//
// Nullable functions ?
fun main(){
    
    val coins: (Int) -> String = { quantity -> 
    "$quantity quaters"
    }
    
    val cupcake: (Int) -> String = {
        "have a cupcake"
        
    }
    
    val trickFunction = trickOrTreat(true, null)
    val treatFunction = trickOrTreat(false, coins)
    trickFunction()
    treatFunction()
    
}

fun trickOrTreat(isTrick: Boolean, extraTreat:((Int) -> String)?): () -> Unit {
    if(isTrick){
        return trick
    }else {
        if(extraTreat != null){
            println(extraTreat(5))
        }        
        return treat
    }   
}


// use lambda expression
val trick = {
    println("No tricks!")
}

// fn with parameters and return type
val treat: () -> Unit = {
    println("No treats!")
}



//
//
// Write lambda expressions with shorthand syntax {it} 
fun main(){
    
    val coins: (Int) -> String = { 
    "$it quaters"
    }
    
    val cupcake: (Int) -> String = {
        "have a cupcake"
        
    }
    
    val trickFunction = trickOrTreat(true, null)
    val treatFunction = trickOrTreat(false, coins)
    trickFunction()
    treatFunction()
    
}

fun trickOrTreat(isTrick: Boolean, extraTreat:((Int) -> String)?): () -> Unit {
    if(isTrick){
        return trick
    }else {
        if(extraTreat != null){
            println(extraTreat(5))
        }        
        return treat
    }   
}


// use lambda expression
val trick = {
    println("No tricks!")
}

// fn with parameters and return type
val treat: () -> Unit = {
    println("No treats!")
}



//
//
// Write lambda expressions with shorthand syntax {it} 
fun main(){

    val trickFunction = trickOrTreat(false, {"$it quaters"}) 
    // Trailing syntax - to be more readable
    val trickFunction = trickOrTreat(false) {"$it quaters"}
    val treatFunction = trickOrTreat(true, null)
    trickFunction()
    treatFunction()
    
}

fun trickOrTreat(isTrick: Boolean, extraTreat:((Int) -> String)?): () -> Unit {
    if(isTrick){
        return trick
    }else {
        if(extraTreat != null){
            println(extraTreat(5))
        }        
        return treat
    }   
}


// use lambda expression
val trick = {
    println("No tricks!")
}

// fn with parameters and return type
val treat: () -> Unit = {
    println("No treats!")
}



//
//
// Repeat Functions {High order functions!} 
fun main(){

    val trickFunction = trickOrTreat(false) {"$it quaters"}
    val treatFunction = trickOrTreat(true, null)
    repeat(5){
        treatFunction()
    }
    trickFunction()
   
    
}

fun trickOrTreat(isTrick: Boolean, extraTreat:((Int) -> String)?): () -> Unit {
    if(isTrick){
        return trick
    }else {
        if(extraTreat != null){
            println(extraTreat(5))
        }        
        return treat
    }   
}


// use lambda expression
val trick = {
    println("No tricks!")
}

// fn with parameters and return type
val treat: () -> Unit = {
    println("No treats!")
}



