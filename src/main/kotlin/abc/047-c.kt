package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem047c(s))
}

fun problem047c(s: String): Int {
    var count = 0
    var prev = s[0]
    for (i in 1 until s.length) {
        val si = s[i]
        if (prev != s[i]) count++
        prev = si
    }
    return count
}