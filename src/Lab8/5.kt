package Lab8

fun main() {
    print("Prob = ")
    val prob = readln().toInt()
    print("Prize = ")
    val prize = readln().toInt()
    print("Pay = ")
    val pay = readln().toInt()
    println(booll(prob, prize, pay))
}

fun booll(prob: Int, prize: Int, pay: Int): Boolean = prob * prize > pay