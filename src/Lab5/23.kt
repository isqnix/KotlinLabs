package Lab5

fun main()
{
    println("Введите две цифры ")
    val num1= readln().toInt()
    val num2= readln().toInt()
    println("Сложение или Умножение?")
    val x=readln()
    when(x)
    {
        "Сложение"->do {
            println(num1+num2)
        }
            while(readln()!="стоп")
            "Умножение"->
                    do {
                        println(num1 * num2)
                    } while (readln() != "стоп")

    }
}