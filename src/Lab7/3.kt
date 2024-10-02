package Lab7

fun main(){
    print("Количество побед: ")
    val a = readln().toInt()
    print("Количество раундов в ничью: ")
    val b = readln().toInt()
    print("Количество поражений: ")
    val c = readln().toInt()

    println("\nКоличество очков: ${(a * 3) + b}")
}