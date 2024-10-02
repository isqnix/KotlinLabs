package Lab8

fun main() {
    print("Введите строку: ")
    val txt = readln().toString()
    print("Введите количество повторений: ")
    val n = readln().toInt()
    repeat(txt, n)
}

fun repeat(txt: String, n: Int): String{
    if (n > 0){
        print(txt)
        repeat(txt, n - 1)
    }
    return txt
}