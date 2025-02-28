//////
////
///
//
//
// Task 1 --> Android docs [classes and Collection]
data class Event(
	val title: String = "Study. Kotlin",
    val description: String? = "Commit to studying Kotlin at least 15 minutes per day.",
    val dayPart: String = "Evening",
    val duration: Int = 15
)

fun main() {
   val event = Event()
   println(event)
}


//////
////
///
//
// Task 2 --> Enums to solve the typos
data class Event(
	val title: String = "Study. Kotlin",
    val description: String? = "Commit to studying Kotlin at least 15 minutes per day.",
    val dayPart: DayPart,
    val duration: Int = 15
)

enum class DayPart{
    MORNING,
    AFTERNOON,
    EVENING
}
fun main() {
   val event = Event(dayPrt=DayPart.EVENING)
   println(event)
}

//////
////
///
//
// Task 3
data class Event(
	val title: String = "Study. Kotlin",
    val description: String? = "Commit to studying Kotlin at least 15 minutes per day.",
    val daypart: Daypart,
    val durationInMinutes: Int = 15
)

enum class Daypart{
    MORNING,
    AFTERNOON,
    EVENING
}
fun main() {
val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)

val events = mutableListOf(event1,event2,event3,event4,event5,event6)
println(events)
}


//////
////
///
//
// Task 4 
data class Event(
	val title: String = "Study. Kotlin",
    val description: String? = "Commit to studying Kotlin at least 15 minutes per day.",
    val daypart: Daypart,
    val durationInMinutes: Int = 15
)

enum class Daypart{
    MORNING,
    AFTERNOON,
    EVENING
}
fun main() {
val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)
val event3 = Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30)
val event4 = Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60)
val event5 = Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10)
val event6 = Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45)

val events = mutableListOf(event1,event2,event3,event4,event5,event6)

val shortEvents = events.filter{it.durationInMinutes < 60}
println("you have ${shortEvents.size} events events")

}



///////
/////
///
//
//