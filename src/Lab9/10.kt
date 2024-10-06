package Lab9

fun main() {
    println("Введите строку: ")
    val str = readln()

    println("Самое длинное слово: ${longestWord(str)}")
}

fun longestWord(input: String): String{
    val words = input.split(" ")
    var longW = ""

    for (word in words) {
        val clean = word.filter { it.isLetter() }

        if (clean.isNotEmpty() && (longW == "" || clean.length > longW.length)) {
            longW = clean
        }
    }
    return longW
}