package Lab9

fun main() {
    println("Какой длины сделать пароль?")
    val n = readln().toInt()
    var pass = ""

    val sim = "~!@#$%^&*._-,;:".toCharArray()
    val char = (('A'..'Z') + ('a'..'z') + (0..9) + sim.toList()).toList()

    for(i in 0..n-1){
        pass += char.random()
    }

    println("Ваш пароль: $pass")
}