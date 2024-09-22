fun main() {
    println("Введите целое число")
    val number = readln().toInt()

    val dvoich = number.toString(2)
    println("Двоичное представление числа $number: $dvoich")
}