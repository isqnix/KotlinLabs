package Lab8

fun main(){
    val arr = IntArray(10)
    print("Массив: ")
    for (i in 0..9){
        arr[i] = (1..99).random()
        print("${arr[i]} ")
    }

    print("\nВведите индекс: ")
    val ind = readln().toInt()
    println("Это число - ${index(arr, ind)}")
}

fun index(arr: IntArray, ind: Int): Int{
    val num = arr[ind]
    return num
}