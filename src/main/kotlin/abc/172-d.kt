package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem172d(n))
}

fun problem172d(n: Long): Long {
    var ans = 0L

    for (i in 1..n) {
        for (j in i..n step i) {
            ans += j
        }
    }
    return ans
}