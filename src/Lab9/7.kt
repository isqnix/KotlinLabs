package Lab9

fun main() {
    println("Введите строку: ")
    val str = readln()
    case(str)
}

fun case(str: String) {
    val caseStr = str.map {
        if (it.isUpperCase()) it.lowercaseChar()
        else it.uppercaseChar()
    }.joinToString("")
    return println(caseStr)
}