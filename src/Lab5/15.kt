fun main() {
    println("Введите слово или предложение(без пробелов с маленькой буквы) ")
    val str = readln()
    val Pal = str == str.reversed()
    if (Pal) {
        println("Строка является палиндромом.")
    } else {
        println("Строка не является палиндромом.")
    }
}