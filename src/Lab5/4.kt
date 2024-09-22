package Lab5

fun main()
{
    print("Введите число ")
    val n=readln().toInt()
    var f=1
    for(i in 1..n)
    {
        f*=i
    }
    println("!$n=$f")

}