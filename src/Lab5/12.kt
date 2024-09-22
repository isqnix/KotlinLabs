package Lab5

fun main()
{
    println("Введите начальное число ")
    val num= readln().toInt()
    println("Введите шаг")
    val stp= readln().toInt()
    for(i in num..9999 step stp)
    {
        print(" $i ")
    }
}