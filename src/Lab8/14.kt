package Lab8

fun main() {
    print("a = ")
    val a = readln().toInt()
    print("b = ")
    val b = readln().toInt()
    println("$a + $b = ${ab(a, b)}")
}

fun ab(a: Int, b: Int): Int = a + b