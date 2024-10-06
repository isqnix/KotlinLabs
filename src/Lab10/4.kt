package Lab10

fun main() {
    print("n = ")
    val n = readln().toInt()
    listNum(n)
}

fun listNum(n: Int){
    var llist: MutableList<Any> = mutableListOf()
    for(i in 1..n){
        when {
            ((i > 5) && (i % 3 == 0) && (i % 5 == 0)) -> llist.add("ВизллБизлл")
            ((i >= 3) && (i % 3 == 0)) -> llist.add("Физллл")
            ((i >= 5) && (i % 5 == 0)) -> llist.add("Бизлллл")
            else -> llist.add(i)
        }
    }
    return println(llist)
}