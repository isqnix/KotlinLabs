package Lab8

fun main() {
    println("Введите строку:")
    val str = readln()
    println("Её реверс:\n${pal(str)}")
}

fun pal(str: String): String = str.reversed()