package basic

import java.util.*

fun main(args: Array<String>) {
    for (i in 1..20) {
        println(i)
    }

    for (i in 20 downTo 1 step 2) {
        println(i)
    }

    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt()) // 将int值转成二进制
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }

}