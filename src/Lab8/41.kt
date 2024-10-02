package Lab8

fun main() {
    println("Введите строку: ")
    val str = readln()
    println("В строке ${vowels(str)} гласных")
}

fun vowels(str: String): Int {
    val vow = "АОУЫЭЕЁИЮЯаоуыэеёиюя"
    var n = 0
    for (char in str) {
        if (char in vow) n++
    }
    return n
}