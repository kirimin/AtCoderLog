package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val b = sc.next()
    println(problem122a(b))
}

fun problem122a(b: String): String {
    return when (b) {
        "A" -> "T"
        "T" -> "A"
        "C" -> "G"
        "G" -> "C"
        else -> ""
    }
}