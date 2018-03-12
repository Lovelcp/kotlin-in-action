package lambda

import java.io.BufferedReader
import java.io.FileReader

fun readFirstLineFromFile(path: String): String {
    BufferedReader(FileReader(path)).use { br ->
        return br.readLine()
    }
}

fun main(args: Array<String>) {
}