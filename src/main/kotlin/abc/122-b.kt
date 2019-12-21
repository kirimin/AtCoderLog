package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem122b(s))
}

fun problem122b(s: String): Int {
    var max = 0
    var count = 0
    val acgt = arrayOf('A', 'C', 'G', 'T')
    for (i in s.indices) {
        if (acgt.contains(s[i])) {
            count++
            max = Math.max(max, count)
        } else {
            count = 0
        }
    }
    return max
}