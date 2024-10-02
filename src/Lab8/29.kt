package Lab8

fun main(){
    print("Введите размер массива: ")
    val n = readln().toInt()
    val arr = IntArray(n)
    println("Введите массив: ")
    for(i in 0..n-1){
        arr[i] = readln().toInt()
    }
    maxmin(arr)
}

fun maxmin(arr: IntArray): Any{
    val max = arr.max()
    val min = arr.min()
    return println("max = $max | min = $min")
}