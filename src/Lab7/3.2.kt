package Lab7

fun main(){
    println("Введите список чисел через пробел: ")
    val nums = readln()

    val list = nums.split(" ").mapNotNull { it.toIntOrNull() }

    println("Минимальное число из списка: ${list.minOrNull()}")
}
