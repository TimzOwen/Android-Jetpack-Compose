 //
//
// interfaces -> specify how a class will implement state/behaviour

fun main() {
    val btnClick = ButtonClick("Timz Owen")
    println(btnClick.onClickEvent("Channels IT"))
}

class ButtonClick(private val userName: String): ClickEvent{
    override fun onClickEvent(message: String) {
        println("Lets welcome $userName to $message team")
    }

}

interface ClickEvent{
    fun onClickEvent(message: String) // implementation is at class level
}



//
//
//
// Multiple class
// interfaces -> specify how a class will implement state/behaviour

fun main() {
    val btnClick = ButtonClick("Timz Owen")
    println(btnClick.onClickEvent("Channels IT"))

    val newJoiner = NewJoiner("Timz Owen")
    newJoiner.onClickEvent("It's a pleasure joining us")
}

class ButtonClick(private val userName: String): ClickEvent{
    override fun onClickEvent(message: String) {
        println("Lets welcome $userName to $message team")
    }

}

class NewJoiner(private val userName: String): ClickEvent{
    override fun onClickEvent(message: String) {
        println("We have a new member $userName joined, $message ")
    }
}

interface ClickEvent{
    fun onClickEvent(message: String) // implementation is at class level
}



//
//
//
// Extension function
fun main() {
    println("Hello Timz ".userName("Owen"))
}

fun String.userName(user: String): String {
    return this.plus(user)
}


//
//
//
// shorter return statement
fun main() {
    println("Hello Timz ".userName("Owen"))
}

fun String.userName(user: String): String = this.plus(user)
