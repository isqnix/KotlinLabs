package Lab5

fun main()
{
    print("Введите число ")
    val num=readln().toInt()
    if(Prost(num)) println("Число простое")
        else
    {
        println("Число составное")
    }
}

fun Prost(num: Int): Boolean {
    if (num < 2) return false
    for (m in 2..num - 1) {
        if (num % m == 0) return false
    }
    return true
}