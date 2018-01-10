package lambda

class Book(val title: String, val authors: List<String>)


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

    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })
    println(strings.map({ it.toList() }))

    val books = listOf(Book("A", listOf("1")), Book("B", listOf("2")), Book("C", listOf("2", "3")))
    println(books.flatMap { it.authors }.toSet())
}