package clazz

class User10(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("""
            Address was changed for $name: "$field" -> "$value".
            """.trimIndent())
            field = value // 要修改address的值，这里必须要用field变量来进行引用，否则会出现循环set的情况
        }

    var counter: Int = 0
        private set // 这样子就不能调用counter的set方法了，也就是user.counter = 1是错误的
}

fun main(args: Array<String>) {
    val user = User10("Alice")
    user.address = "aldfkjaklsdfj"
    // user.counter = 1 // 编译会失败
}