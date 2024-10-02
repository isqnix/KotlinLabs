package Lab8

fun main() {
    println("Введите элементы списка через пробел: ")
    val str = readln()
    val list = str.split(" ").mapNotNull {it.toIntOrNull()}
    println("Разность max и min элементов: ${isDiff(list.toMutableList())}")
}

fun isDiff(list: MutableList<Int>): Int{
    val min = list.min()
    val max = list.max()
    val diff = max - min
    return diff
}