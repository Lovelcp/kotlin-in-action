package operator

import java.time.LocalDate

fun main(args: Array<String>) {
    val now = LocalDate.now()
    val vacation = now..now.plusDays(10)
    println(now.plusWeeks(1) in vacation)

    (0..10).forEach { print(it) }
}