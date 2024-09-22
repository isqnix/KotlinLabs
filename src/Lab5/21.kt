package Lab5

fun main() {
    println("Введите год")
    val year = readln().toInt()
    println("Введите месяц цифрой")
    val month = readln().toInt()

    when (month) {
        1, 3, 5, 7, 8, 10, 12 -> {
            for (i in 1..31) {
                println("$i.$month.$year")
            }
        }
        4, 6, 9, 11 -> {
            for (i in 1..30) {
                println("$i.$month.$year")
            }
        }
        2 -> {
            val daysInFebruary = if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 29 else 28
            for (i in 1..daysInFebruary) {
                println("$i.$month.$year")
            }
        }
        else -> println("12 месяцев в году")
    }
}