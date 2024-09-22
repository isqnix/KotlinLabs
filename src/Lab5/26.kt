fun main() {
    println("Введите число N:")
    val n = readLine()?.toIntOrNull()

    if (n != null && n > 0) {
        var evenSum = 0
        var oddSum = 0

        for (i in 1..n) {
            if (i % 2 == 0) {
                evenSum += i
            } else {
                oddSum += i
            }
        }

        println("Сумма чётных чисел от 1 до $n: $evenSum")
        println("Сумма нечётных чисел от 1 до $n: $oddSum")
    } else {
        println("Введите положительное целое число")
    }
}