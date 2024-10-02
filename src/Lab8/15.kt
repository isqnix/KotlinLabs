package Lab8

fun main() {
    print("a = ")
    val a = readln().toInt()
    print("b = ")
    val b = readln().toInt()
    println("Большее число: ${comp(a, b)}")
}

fun comp(a: Int, b: Int): Int {
    if (a > b) return a
    else return b
}