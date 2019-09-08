package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val c = sc.next()
    println(problem049a(c))
}

fun problem049a(c: String): String {
    return when (c) {
        "a", "i", "u", "e", "o" -> "vowel"
        else -> "consonant"
    }
}