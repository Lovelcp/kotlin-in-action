package type

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun main(args: Array<String>) {
    var email: String? = "test@qq.com"
    email?.let { sendEmailTo(it) }
    email = null
    email?.let { sendEmailTo(it) } // 什么都不会做
}