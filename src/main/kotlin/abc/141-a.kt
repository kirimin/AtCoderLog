package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem141a(s))
}

fun problem141a(s: String): String {
    return when (s) {
        "Sunny" -> "Cloudy"
        "Cloudy" -> "Rainy"
        "Rainy" -> "Sunny"
        else -> ""
    }
}