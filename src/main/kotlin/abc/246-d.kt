package abc

import utilities.debugCount
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem246d(n))
}

fun problem246d(n: Long): Long {
    for (x in n until n * 2) {
        for (a in 0 .. 10L) {
            for (b in a + 1 ..  1000L) {
                val tmp = a * a * a + a * a * b + a * b * b + b * b * b
                if (tmp > x) break
                if (x == tmp) {
//                    debugLog(a, b)
                    return x
                }
            }
        }
    }
    return 0
}