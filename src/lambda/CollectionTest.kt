package lambda

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0 })
    println(list.map { it * it })

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })

    println(list.all { it > 2 })
    println(list.any { it > 2 })
    println(list.count { it > 2 })
    println(list.find { it > 2 })

    println(listOf("a", "ab", "b").groupBy(String::first))
}