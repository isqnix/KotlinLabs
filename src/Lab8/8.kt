package Lab8

fun main() {
    print("Введите количество минут: ")
    val min = readln().toInt()
    print("Введите частоту кадров в минуту: ")
    val fps = readln().toInt()
    println("Количество кадров: ${frames(min, fps)}")
}

fun frames(min: Int, fps: Int): Int = min * fps