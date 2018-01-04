package clazz

class Client(val name: String, val postalCode: Int)

// 数据类
data class Client1(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    println(Client("a", 11).toString())
    println(Client1("b", 22))
    println(Client1("c", 33).copy(postalCode = 44)) // 通过copy方法快速生成另一个数据类
}