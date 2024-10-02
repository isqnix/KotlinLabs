package Lab8

fun main(){
    print("Введите размер массива: ")
    val n = readln().toInt()
    val arr = IntArray(n)
    print("Массив: ")
    for(i in 0..n-1){
        arr[i] = (1..666).random()
        print("${arr[i]}  ")
    }
    print("\nРеверс: ${rev(arr)}")
}

fun rev(arr: IntArray): List<Int> = arr.reversed()