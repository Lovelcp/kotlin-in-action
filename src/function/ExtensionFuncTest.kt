package function

fun Collection<String>.join(separator: String = "", prefix: String = "", suffix: String = "")
        = joinToString(separator, prefix, suffix)

fun main(args: Array<String>) {
    println(listOf("one", "two", "three").join(" "))
}