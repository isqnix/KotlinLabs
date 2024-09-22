fun main() {
    val matrix = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    val transposed = Array(matrix[0].size) { Array(matrix.size) { 0 } }

    for (i in matrix.indices) {
        for (j in matrix[0].indices) {
            transposed[j][i] = matrix[i][j]
        }
    }

    println("Транспонированная матрица:")
    transposed.forEach { row -> println(row.joinToString(" ")) }
}