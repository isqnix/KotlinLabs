package Lab8

fun main() {
    print("k = ")
    val k = readln().toInt()
    print("n = ")
    val n = readln().toInt()
    println(degree(k, n))
}

fun degree(k: Int, n: Int): Boolean = Math.pow(k.toDouble(), k.toDouble()).toInt() == n