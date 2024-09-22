import kotlin.random.Random

fun bubbleSort(array: IntArray) {
    val n = array.size
    for (i in 0 until n) {
        for (j in 0 until n - i - 1) {
            if (array[j] > array[j + 1]) {
                // меняем местами
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}

fun main() {
    val numbers = intArrayOf(90,10,12,15,88,14,75,97,56,32,71)
    println("Двузначные числа до сортировки: ${numbers.joinToString(", ")}")

    bubbleSort(numbers)

    println("Двузначные числа после сортировки: ${numbers.joinToString(", ")}")
}