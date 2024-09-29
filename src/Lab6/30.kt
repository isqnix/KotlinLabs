package Lab6

fun main(){
    val arr = IntArray(100)
    var n = 0
    print("Массив: ")

    for(i in 0..99){
        arr[i] = (10..99).random()
        print("${arr[i]}  ")
    }
    println("\nГруппы в массиве:")

    for(i in 0..99){
        print("${arr[i]}  ")
        n++

        if (n == 10){
            println("")
            n = 0
        }
    }
}