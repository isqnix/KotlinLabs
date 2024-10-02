package Lab7

fun main(){
    print("Введите первое число: ")
    val a = readln().toInt()
    print("Введите второе число: ")
    val b = readln().toInt()

    println("Числа равны - ${a == b}")
}