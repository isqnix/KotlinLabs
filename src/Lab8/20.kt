package Lab8

fun main(){
    print("Введите размер массива: ")
    val n = readln().toInt()
    val arr = IntArray(n)
    println("Введите массив: ")
    for(i in 0..n-1){
        arr[i] = readln().toInt()
    }
    print("\nМакчимальное число: ${arrMax(arr)}")
}

fun arrMax(arr: IntArray): Int = arr.max()