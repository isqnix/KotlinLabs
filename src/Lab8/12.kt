package Lab8

fun main() {
    print("Введите любое число: ")
    val n = readln().toInt()
    println(google(n))
}

fun google(n: Int): String = "G" + "o".repeat(n) + "gle"