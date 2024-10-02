package Lab8

fun main() {
    print("N = ")
    val N = readln().toInt()
    println("Сумма натуральных $N чисел = ${summN(N)}")
}

fun summN(N: Int): Int = (1..N).sum()