package Lab8

fun main() {
    print("Введите число: ")
    val n = readln().toInt()
    println("Факториал числа: ${repeat(n)}")
}

fun repeat(n: Int): Int{
    var f = 1
    for(i in 2..n){
        f *= i
    }
    return f
}