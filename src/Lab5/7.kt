package Lab5

fun main() {
    println("Введите количество чисел Фибоначчи (N):")
    val N = readln().toInt()
    var a = 0
    var b = 1
    println("Первые $N чисел Фибоначчи:")
    for (i in 0 .. N) {
        print(" $a ")
        val next = a + b
        a = b
        b = next
    }
}