package Lab8

fun main() {
    println("Введите элементы списка-1 через пробел: ")
    val str1 = readln()
    val list1 = str1.split(" ").mapNotNull {it.toIntOrNull()}
    println("Введите элементы списка-2 через пробел: ")
    val str2 = readln()
    val list2 = str2.split(" ").mapNotNull {it.toIntOrNull()}

    println("Объединённый список: ${isSumm(list1.toMutableList(), list2.toMutableList())}")
}

fun isSumm(list1: MutableList<Int>, list2: MutableList<Int>): List<Int>{
    val list = list1 + list2
    return list
}