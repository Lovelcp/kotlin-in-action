package function

@JvmOverloads
fun <T> joinToString(collection: Collection<T>, separator: String = ", ", prefix: String = "", suffix: String = ""): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        result.append(element)
    }
    result.append(suffix)
    return result.toString()
}

fun main(args: Array<String>) {
    println(joinToString(arrayListOf(1, 2, 3), separator = "; "))
}