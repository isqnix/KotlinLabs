package Lab5

fun main() {
    println("Введите высоту треугольника ")
    val height = readln().toInt()

    for (i in 0 .. height) {
        println(" ".repeat(height - i - 1) + "*".repeat(2 * i + 1))
    }
}