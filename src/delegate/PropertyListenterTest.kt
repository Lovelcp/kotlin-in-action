package delegate

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)

    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}

class Member(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    // 创建一个lambda函数
    private val observer = { prop: KProperty<*>, oldValue: Int, newValue: Int ->
        println("${prop.name} changed from $oldValue to $newValue")
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }

    var age: Int by Delegates.observable(age, observer)
    var salary: Int by Delegates.observable(salary, observer)
}

fun main(args: Array<String>) {
    val m = Member("Tom", 20, 2000)
    m.age = 20
    m.salary = 3000
}