fun main() {

    println("Введите конечное значение диапазона:")
    val end = readln().toInt()

    println("Простые числа в диапазоне от 1 до $end:")
    for (i in 1..end)
        if (Prost(i)) println(i)
        }
