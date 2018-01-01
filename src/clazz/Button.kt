package clazz

class Button : Clickable, Focusable {
    override fun click() {
        println("I was clicked")
    }

    /**
     * 如果父类（或者接口）有同样的默认实现方法，那么子类必须要显示的override该方法
     */
    override fun showOff() {
        super<Clickable>.showOff()
    }
}

fun main(args: Array<String>) {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}