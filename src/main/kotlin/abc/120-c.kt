package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem120c(s))
}

fun problem120c(s: String): Int {
    var redCount = 0
    var blueCount = 0
    for (i in s.indices) {
        when (s[i]) {
            '0' -> redCount++
            '1' -> blueCount++
            else -> {}
        }
    }
    if (redCount == 0 || blueCount == 0) return s.length - Math.max(redCount, blueCount)
    return s.length - (Math.max(redCount, blueCount) - Math.min(redCount, blueCount))
}