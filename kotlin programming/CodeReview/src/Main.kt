fun main(){
    println("Enter num 1: ")
    val num1 = readln().toInt()
    println("Enter num2: ")
    val num2 = readln().toInt()

    println("The sum of $num1 + $num2 = " + addNumbers(num1,num2))

}

fun addNumbers(num1: Int, num2: Int): Int{
    return num1 + num2
}