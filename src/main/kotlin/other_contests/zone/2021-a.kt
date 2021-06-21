package other_contests.zone

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem2021a(s))
}

fun problem2021a(s: String): Int {
    var count = 0
    for (i in 0 until s.length - 3) {
        if (s.substring(i, i + 4) == "ZONe") count++
    }
    return count
}