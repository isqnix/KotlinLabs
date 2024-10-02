package Lab8

fun main() {
    println("Введите строку: ")
    val str = readln()
    println("В вашей строке ${char(str)} символов")
}

fun char(str: String): Int = str.length