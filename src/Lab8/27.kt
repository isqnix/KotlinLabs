package Lab8

fun main(){
    val arr = IntArray(10)
    print("Массив: ")
    for (i in 0..9){
        arr[i] = (1..99).random()
        print("${arr[i]} ")
    }

    print("\nВведите число: ")
    val num = readln().toInt()
    if(isNuum(arr, num)) println("Такое число есть")
    else println("Такого числа нет((")
}

fun isNuum(arr: IntArray, num: Int): Boolean{
    for(i in 0..9){
        if (arr[i] == num) return true
    }
    return false
}