package operator

/**
 * 点类
 */
data class Point(val x: Int, val y: Int) {
    /**
     * 重载加法
     */
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

/**
 * 重载乘法
 * 通过扩展函数的形式进行重载
 */
operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

/**
 * 重载取反运算符
 */
operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

operator fun Point.get(index: Int): Int {
    return when (index) {
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) {
    // 根据给出的index修改对应的坐标
    when (index) {
        0 -> x = value
        1 -> y = value
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

data class Rectangle(val upperLeft: Point, val lowerRight: Point)

/**
 * 判断某个点是否在某个矩形内
 */
operator fun Rectangle.contains(p: Point): Boolean {
    return p.x in upperLeft.x until lowerRight.x &&
            p.y in upperLeft.y until lowerRight.y
}

class Person(val firstName: String, val lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        // 按顺序调用给定的方法，并比较他们的值
        return compareValuesBy(this, other, Person::lastName, Person::firstName)
    }
}

fun main(args: Array<String>) {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)

    val p3 = Point(10, 20)
    println(p3 * 1.5)

    val p4 = Point(10, 20)
    println(-p4)

    val p5 = Point(10, 20)
    println(p5[1])

    val mp = MutablePoint(10, 20)
    mp[1] = 42
    println(mp)

    val rect = Rectangle(Point(10, 20), Point(50, 50))
    println(Point(20, 30) in rect)
    println(Point(5, 5) in rect)

    val p6 = Point(10, 20)
    val (x, y) = p6
    println(x)
    println(y)

    val list = arrayListOf(1, 2)
    list += 3
    val newList = list + listOf(4, 5)
    println(list)
    println(newList)
}