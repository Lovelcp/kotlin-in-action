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

    // 不会执行print，因为是惰性操作
    listOf(1, 2, 3, 4).asSequence().map { println("map($it) "); it * it }.filter { println("filter($it)"); it % 2 == 0 }

    // 只有执行了toList，从序列转换为集合的时候，才会打印信息
    listOf(1, 2, 3, 4).asSequence().map { println("map($it) "); it * it }.filter { println("filter($it)"); it % 2 == 0 }.toList()

    // 通过比较可以清晰地看到序列和非序列对元素的操作顺序是不一样的
    listOf(1, 2, 3, 4).map { println(it);it * it }.find { println(it);it > 3 }
    listOf(1, 2, 3, 4).asSequence().map { println(it);it * it }.find { println(it);it > 3 }
}