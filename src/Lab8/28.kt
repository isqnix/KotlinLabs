package Lab8

fun main() {
    print("Введите размер массива: ")
    val n = readln().toInt()
    print("Введите верхнюю границу массива массива: ")
    val N = readln().toInt()
    println(randArr(n, N).joinToString(" "))
}

fun randArr(n: Int, N: Int): IntArray{
    val arr = IntArray(n)
    for (i in 0..n-1){
        arr[i] = (1..N).random()
    }
    return arr
}