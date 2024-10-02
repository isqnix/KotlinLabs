package Lab7

fun main() {
    var num1 = readln().toInt()
    var z = readln()
    var sim: Char = z[0]
    var num2 = readln().toInt()

    num1 = isCalcul(num1, sim, num2)
    println("= $num1")

    z = readln()
    sim = z[0]
    while (sim != 'c'){
        num2 = readln().toInt()
        num1 = isCalcul(num1, sim, num2)
        println("= $num1")
        z = readln()
        sim = z[0]
    }
}

fun isCalcul(num1: Int, sim: Char, num2: Int): Int{
    var num3: Int = 0
    when (sim) {
        '+' -> num3 = num1 + num2
        '-' -> num3 = num1 - num2
        '*' -> num3 = num1 * num2
        '/' -> num3 = num1 / num2
        '^' -> num3 = Math.pow(num1.toDouble(), num2.toDouble()).toInt()
        '%' -> num3 = num1 % num2
    }
    return num3
}
