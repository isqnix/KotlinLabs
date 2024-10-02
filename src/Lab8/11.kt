package Lab8

fun main() {
    println("Введите уравнение (#1+1): ")
    val eq = readln()

    println("$eq = ${equation(eq)}")
}

fun equation(eq: String): Int {
    val exam = eq.toCharArray()
    val examInt = exam.filter { it.isDigit() }.toCharArray()
    val eqInt = examInt.map { it.digitToInt() }.toIntArray()
    val eqChar = exam.filter { !it.isDigit() }.toCharArray()
    val n = eqChar.size
    var res = eqInt[0]

    for(i in 0..<n){
        when(eqChar[i]){
            '+' -> {res += eqInt[i+1]}
            '-' -> {res -= eqInt[i+1]}
            '*' -> {res *= eqInt[i+1]}
            '/' -> {res /= eqInt[i+1]}
        }
    }
    return res
}