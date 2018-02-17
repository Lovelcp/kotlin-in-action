package type

fun main(args: Array<String>) {
    val fiveZeros = IntArray(5) // 对应为IntArray
    val squares = IntArray(5) { i -> (i + 1) * (i + 1) }
    println(squares.joinToString())
}