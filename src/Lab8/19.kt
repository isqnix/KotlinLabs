package Lab8

fun main(){
    print("Введите размер массива: ")
    val n = readln().toInt()
    val arr = IntArray(n)
    println("Введите массив: ")
    for(i in 0..n-1){
        arr[i] = readln().toInt()
    }
    print("\nСумма элементов массива = ${arrSum(arr)}")
}

fun arrSum(arr: IntArray): Int = arr.sum()