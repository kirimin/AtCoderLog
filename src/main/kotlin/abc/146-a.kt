package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem146a(s))
}

fun problem146a(s: String): Int {
    return when(s) {
        "SUN" -> 7
        "MON" -> 6
        "TUE" -> 5
        "WED" -> 4
        "THU" -> 3
        "FRI" -> 2
        "SAT" -> 1
        else -> 0
    }
}