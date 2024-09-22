fun main() {
    println("Введите N")
    val N = readln().toInt()
    var sum=0
    for (i in 1..N)
    {
        sum+=i*i

    }
    print("Сумма квадратов равна $sum")
}