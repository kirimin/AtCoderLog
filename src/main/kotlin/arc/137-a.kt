package arc

import utilities.debugCount
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val l = sc.nextLong()
    val r = sc.nextLong()
    println(problem137a(l, r))
}

fun problem137a(l: Long, r: Long): Long {
    /**
     * 最大公約数
     */
    fun computeGreatestCommonDivisor(a: Long, b: Long): Long {
        val big: Long
        val small: Long
        if (a > b) {
            big = a
            small = b
        } else {
            small = a
            big = b
        }
        val rest = big % small
        return if (rest == 0L) small else computeGreatestCommonDivisor(small, rest)
    }

    var max = 0L
    for (i in l .. l + 100) {
        for (j in r downTo i + 1) {
            val gcd = computeGreatestCommonDivisor(i, j)
//            debugLog(i, j)
            if (gcd == 1L) {
//                if (max < j - i) {
//                    debugLog(j - i)
//                }
                max = Math.max(j - i, max)
                break
            }
        }
    }
    return max
}