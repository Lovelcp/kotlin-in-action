package clazz

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable") // 接口中所有的方法都是open的
}