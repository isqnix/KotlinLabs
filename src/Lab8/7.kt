package Lab8

fun main() {
    print("Введите целое число: ")
    val a = readln().toInt()
    println(div(a))
}

fun div(a: Int): Boolean = a % 100 == 0