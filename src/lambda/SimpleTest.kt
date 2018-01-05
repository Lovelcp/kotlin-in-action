package lambda

import basic.Person

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int -> x + y }
    { println(42) }()
    run({ println(42) })
    println(sum(1, 2))

    val people = listOf(Person("Alice", 20), Person("Bob", 31))

    println(people.maxBy { p: Person -> p.age }) // 最完整的形式
    println(people.maxBy { p -> p.age }) // 省略Person类型的定义
    println(people.maxBy { it.age }) // 通过it来指代person对象
}