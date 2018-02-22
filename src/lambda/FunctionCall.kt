package lambda

fun twoAndThree(operation: (Int, Int) -> Int) { // 定义一个函数类型的参数
    val result = operation(2, 3)
    println("The result is $result")
}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) sb.append(element)
    }
    return sb.toString()
}

fun main(args: Array<String>) {
    twoAndThree({ a, b -> a + b })
    twoAndThree({ a, b -> a * b })
}