package clazz

class CountingSet<T>(private val innerSet: MutableCollection<T> = HashSet()) : MutableCollection<T> by innerSet {
    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }
}

fun main(args: Array<String>) {
    val c = CountingSet<Int>()
    c.addAll(listOf(1, 2, 3))
    println(c.objectsAdded)
}