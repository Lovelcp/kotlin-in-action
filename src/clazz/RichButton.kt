package clazz

open class RichButton : Clickable { // 这个类是open的，其他类可以继承它
    fun disable() {} // 这个函数是final的，不能在子类中重写他
    open fun animate() {} // 这个函数是open的，可以在子类中重写它
    override fun click() {} // 这个函数重写了一个open函数，并且它本身同样是open的
//    final override fun click() {} // 加上final防止子类重写默认open的override方法
}