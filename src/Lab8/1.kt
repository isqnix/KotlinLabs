package Lab8

fun main() {
    println("Введите элементы списка через пробел: ")
    val str = readln()
    val list = str.split(" ").mapNotNull {it.toIntOrNull()}
    println("Сумма элементов списка: ${isSum(list.toMutableList())}")
}

fun isSum(list: MutableList<Int>): Int{
    val sum = list.sum()
    return sum
}