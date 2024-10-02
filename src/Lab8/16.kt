package Lab8

fun main() {
    print("Введите любое число: ")
    val n = readln().toInt()
    println(parity(n))
}

fun parity(n: Int): Boolean = n % 2 == 0