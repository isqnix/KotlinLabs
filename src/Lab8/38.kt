package Lab8

fun main() {
    println("Введите строку: ")
    val str = readln()
    println("Длина вашей строки: ${leng(str)}")
}

fun leng(str: String): Int = str.length