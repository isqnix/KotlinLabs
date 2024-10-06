package Lab10

fun main(){
    print("n = ")
    val n = readln().toInt()
    generatePyramid(n)
}

fun generatePyramid(n: Int){
    val c = "#"
    for(i in 1..n*2){
        for(j in 0..(n*2-i)/2)
            if (i % 2 != 0) print("\t")
        for(l in 1..i)
            if (i % 2 != 0) print("$c\t")
        println()
    }
}