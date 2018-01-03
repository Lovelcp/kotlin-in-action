package clazz

interface User {
    val nickname: String
}

class PrivateUser(override val nickname: String) : User

// 一个走的是定义get方法，另一个走的是直接属性字段初始化的时候赋值

class SubscribingUser(val email:String) :User {
    override val nickname: String
        get() = email.substringBefore('@') // 自定义getter
}

class FaceBookUser(val accountId:Int):User {
    override val nickname: String = "aa" // 属性初始化
}

fun main(args: Array<String>) {
    val a = PrivateUser("a")
    println(a.nickname)
    val b = SubscribingUser("bb@qq.com")
    println(b.nickname)
}