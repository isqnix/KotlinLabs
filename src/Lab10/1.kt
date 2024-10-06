package Lab10

fun main() {
    print("n = ")
    val n = readln().toInt()

    number(n)
}

fun number(n: Int) {
    for(i in n downTo 1){
        print("$i  ")
    }
}