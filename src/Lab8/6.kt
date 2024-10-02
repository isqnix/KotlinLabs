package Lab8

fun main() {
    print("Введите первое число: ")
    val a = readln().toInt()
    print("Введите второе число: ")
    val b = readln().toInt()
    println(sumBool(a, b))
}

fun sumBool(a: Int, b: Int): Boolean = a + b < 100