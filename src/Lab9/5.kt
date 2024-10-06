package Lab9

fun main() {
    print("Введите верхнюю границу дипазона: ")
    val N = readln().toInt()
    for (n in 1..N)
        if (allSimp(n)) println(n)
}

fun allSimp(n: Int): Boolean {
    if (n == 1) return false
    else {
        for(i in 1..n-1) {
            if (i == 1)continue
            else if (n % i == 0) return false
        }
    }
    return true
}