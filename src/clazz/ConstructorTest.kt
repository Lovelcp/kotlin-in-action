package clazz

/**
 * 学习使用主构造方法和默认参数以及初始化语句的使用
 */

class User1 constructor(nickname: String) {
    val nickname: String

    init {
        this.nickname = nickname
    }
}

class User2(nickname: String) {
    val nickname = nickname
}

class User3(val nickname: String)

class User4(val nickname: String, val isSubscribed: Boolean = true)

open class User5(val nickname: String)

class TwitterUser(nickname: String) : User5(nickname)

open class Button2

class RadioButton : Button2()

class Secretive private constructor() {}

fun main(args: Array<String>) {
    println(User1("1").nickname)
    println(User2("2").nickname)
    println(User3("3").nickname)
}