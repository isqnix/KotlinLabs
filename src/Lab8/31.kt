package Lab8

fun main() {
    print("Введите градусы в С = ")
    val c = readln().toInt()
    println("Градусы в F = ${fah(c)}")
}

fun fah(c: Int): Int = c * (9 / 5) + 32