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


//







// CLASSES & OBJECTS LONG TEST
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

open class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"
        protected set

    open val deviceType = "unknown"

    open fun turnOn() {
        deviceStatus = "on"
    }

    open fun turnOff() {
        deviceStatus = "off"
    }
}

class SmartTvDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart TV"

    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)

    private var channelNumber by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 200)

    fun increaseSpeakerVolume() {
        speakerVolume++
        println("Speaker volume increased to $speakerVolume.")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number increased to $channelNumber.")
    }

    override fun turnOn() {
        super.turnOn()
        println(
            "$name is turned on. Speaker volume is set to $speakerVolume and channel number is " +
                "set to $channelNumber."
        )
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String) :
    SmartDevice(name = deviceName, category = deviceCategory) {

    override val deviceType = "Smart Light"

    private var brightnessLevel by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 100)

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel.")
    }

    override fun turnOn() {
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

class SmartHome(
    val smartTvDevice: SmartTvDevice,
    val smartLightDevice: SmartLightDevice
) {

    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        deviceTurnOnCount++
        smartTvDevice.turnOn()
    }

    fun turnOffTv() {
        deviceTurnOnCount--
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTvDevice.increaseSpeakerVolume()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }

    fun turnOnLight() {
        deviceTurnOnCount++
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        deviceTurnOnCount--
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOffLight()
    }
}

class RangeRegulator(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {

    var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        if (value in minValue..maxValue) {
            fieldData = value
        }
    }
}

fun main() {
    var smartDevice: SmartDevice = SmartTvDevice("Android TV", "Entertainment")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice("Google Light", "Utility")
    smartDevice.turnOn()
}


//
