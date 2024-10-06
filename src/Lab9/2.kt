package Lab9

fun main() {
    println("Введите строку: ")
    val str = readln()
    letters(str)
}

fun letters(str: String) {
    val vowels = "АОУЫЭЕЁИЮЯаоуыэеёиюя"
    var n1 = 0; var n2 = 0
    for (char in str) {
        if (char in vowels) n1++
        else if (char in '0'..'9') continue
        else n2++
    }
    return println("В строке $n1 гласных и $n2 согласных")
}