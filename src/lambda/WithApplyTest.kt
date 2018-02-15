package lambda

fun alphabet(): String {
    val sb = StringBuilder()
    return with(sb) {
        for (letter in 'A'..'Z') {
            append(letter)
        }
        append("\nNow I know the alphabet!")
        toString()
    }
}

fun alphabet1() = with(StringBuilder()) {
    for (letter in 'A'..'B') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}

fun alphabet2() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()
