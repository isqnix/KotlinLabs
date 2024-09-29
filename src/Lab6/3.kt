package Lab6

fun main(){
    val arr = IntArray(10)
    print("Массив: ")
    for(i in 0..9){
        arr[i] = (1..666).random()
        print("${arr[i]}  ")
    }
    print("\nМаксимальное значение: ${arr.max()}")
    print("\nМинимальное значение: ${arr.min()}")
}