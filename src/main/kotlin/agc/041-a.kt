package agc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val a = sc.nextLong()
    val b = sc.nextLong()
    println(problem041a(n, a, b))
}

fun problem041a(n: Long, a: Long, b: Long): Long {
    if (((a % 2 == 0L && b % 2 == 0L) || (a % 2 != 0L && b % 2 != 0L)) && b - a < Math.max(a - 1, b - 1) && b - a < Math.max(n - a, n - b)) {
        return (b - a) / 2
    } else if (b - 1 <  n - a) {
        // 0に向かう
        return if (b - a == 1L) {
            b - 1
        } else {
            ((a - 1) * 2 + 1 + b - a) / 2
        }
    } else {
        // nに向かう
        return if (b - a == 1L) {
            n - a
        } else {
            ((n - b) * 2 + 1 + b - a) / 2
        }
    }
}