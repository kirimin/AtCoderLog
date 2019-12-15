package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem147b(s))
}

fun problem147b(s: String): Int {
    val s1 = s.take(s.length / 2)
    val s2 = s.takeLast(s.length / 2)
    var count = 0
    for (i in 0 until s1.length) {
        if (s1[i] != s2[s2.length - i - 1]) {
            count++
        }
    }
    return count
}