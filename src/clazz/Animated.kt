package clazz

abstract class Animated { // 这个类是抽象的，不能创建它的实例
    abstract fun animate() // 这个函数是抽象的，必须被子类重写

    open fun stopAnimating() {} // 抽象类中的非抽象方法并不是默认open的

    fun animateTwice() {}
}