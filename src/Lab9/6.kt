package Lab9

fun main() {
    print("Введите размер массива: ")
    val n = readln().toInt()
    println("Введите массив: ")
    val arrStr: Array<String> = Array(n) {""}

    for(i in 0..n-1) {
        arrStr[i] = readln()
    }

    println("Отсортированный массив: ${arrStr.sorted()}")
}