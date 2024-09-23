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
