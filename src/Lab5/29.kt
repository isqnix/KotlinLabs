fun main() {
    println("Введите число")
    val N = readln().toInt()
    var sum: Double = 0.0
    for(i in 1..N){
        sum += 1.0/i
    }
    println("Сумма ряда от 1 до 1/$N = $sum")
}