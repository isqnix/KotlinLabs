package Lab8

fun main() {
    println("Введите стрроку-1: ")
    val str1 = readln()
    println("Введите стрроку-2: ")
    val str2 = readln()
    println("Полученная строка:\n${sstr(str1, str2)}")
}

fun sstr(str1: String, str2: String): String = str1 + str2