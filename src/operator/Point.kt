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

fun main(args: Array<String>) {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)

    val p3 = Point(10, 20)
    println(p3 * 1.5)

    val list = arrayListOf(1, 2)
    list += 3
    val newList = list + listOf(4, 5)
    println(list)
    println(newList)
}