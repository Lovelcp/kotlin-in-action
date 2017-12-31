package function

val String.lastChar: Char
    get() = get(length - 1)

fun main(args: Array<String>) {
    println("Kotlin".lastChar)
}
