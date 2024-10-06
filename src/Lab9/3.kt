package Lab9

fun main() {
    print("Введите сумму в рублях: ")
    val rub = readln().toDouble()
    println("Сумма в йенах: ${rub * 0.64}")
}