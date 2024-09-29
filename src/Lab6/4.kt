package Lab6

fun main(){
    var a = IntArray(10)
    print("Неотсортированный массив: ")
    for (i in 0..9){
        a[i] = (1..99).random()
        print("${a[i]} ")
    }
    println("")
    a = isSortt(a)
    print("Отсоритрованный массив: ")
    for (i in a){
        print("$i ")
    }
}

fun isSortt(a: IntArray): IntArray{
    for (i in 0 until 10 - 1) {
        for (j in 0 until 10 - i - 1) {
            if (a[j] > a[j + 1]) {
                val temp = a[j]
                a[j] = a[j + 1]
                a[j + 1] = temp
            }
        }
    }
    return a
}
