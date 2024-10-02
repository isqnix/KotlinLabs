package Lab8

fun main() {
    print("Prob = ")
    val prob = readln().toInt()
    print("Prize = ")
    val prize = readln().toInt()
    print("Pay = ")
    val pay = readln().toInt()
    println(bool(prob, prize, pay))
}

fun bool(prob: Int, prize: Int, pay: Int): Boolean = prob * prize > pay