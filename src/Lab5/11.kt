package Lab5

fun main() {
    println("Введите первое слово")
    val a = readln()
    println("Введите второе слово")
    val b = readln()
    if (Anagrama(a, b)) println("$a и $b анаграммы")
    else println("$a и $b не анаграммы")
}

fun Anagrama(a: String, b: String): Boolean{
    for(i in a) {
        if(i in b) continue
        return false
    }
    return true
}