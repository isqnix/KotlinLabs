package Lab5

fun main() {
    print("Введите два числа: ")
    val m = readln().toInt()
    val n = readln().toInt()

    var a = m
    var b = n

    while (b != 0) {
        val с = b
        b = a % b
        a = с
    }

    println("НОД равен $a")
}