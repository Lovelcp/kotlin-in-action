package lambda

import basic.Person

fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun printProblemCounts(responses: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    responses.forEach {
        if (it.startsWith("4")) {
            clientErrors++
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int -> x + y }
    { println(42) }()
    run({ println(42) })
    println(sum(1, 2))

    val people = listOf(Person("Alice", 20), Person("Bob", 31))

    println(people.maxBy { p: Person -> p.age }) // 最完整的形式
    println(people.maxBy { p -> p.age }) // 省略Person类型的定义
    println(people.maxBy { it.age }) // 通过it来指代person对象

    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")

    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses)
}