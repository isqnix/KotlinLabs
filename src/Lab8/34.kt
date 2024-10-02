package Lab8

fun main() {
    println("Введите строку: ")
    val str = readln()
    println(strNew(str))
}
fun strNew(str: String): String = str.replace(" ", "")