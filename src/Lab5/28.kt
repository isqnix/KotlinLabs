package Lab5

fun main(){
    println("Введите количество чисел ")
    val nums = readln().toInt()
    val a = arrayOfNulls<Int>(nums)
    print("Введите числа: ")
    for (i in 0..nums-1){
        a[i] = readln().toInt()
    }
    a.sort()
    println("Отсоритрованная последовательность")
    for (i in a){
        print("$i ")
    }
}