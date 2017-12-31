package basic

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE
}

fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
        }

fun getWarmth(color: Color) = when (color) {
    Color.RED, Color.ORANGE -> "Warm"
    else -> throw Exception("Dirty basic.Color")

}

fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)) {
    setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
    else -> throw Exception()
}

fun main(args: Array<String>) {
    println(getMnemonic(Color.RED))
}
