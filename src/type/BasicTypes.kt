package type

fun main(args: Array<String>) {
    val i = 1
    val l: Long = i.toLong() // 显式转换

    val b: Byte = 1
    val a = b + 1L // 通过重载+号运算符，进行必要的类型转换

    println("42".toInt())
}