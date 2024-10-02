package Lab8

fun main() {
    println("Введите строку: ")
    val str = readln()
    println(reg(str))
}

fun reg(str: String): String = str.uppercase()