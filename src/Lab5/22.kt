fun main(){

    val N = (1..100).random()
    println(N)//подсказка
    println("Угадайте число")
    do {
        val a=readln().toInt()
        println("Не угадал")
    }
        while(a!=N)
        print("Угадал")
}