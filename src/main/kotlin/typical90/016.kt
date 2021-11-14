package typical90

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val a = sc.nextLong()
    val b = sc.nextLong()
    val c = sc.nextLong()
    println(problem016(n, a, b, c))
}

fun problem016(n: Long, a: Long, b: Long, c: Long): Int {
    var min = 9999
    for (i in 0..9999) {
        for (j in 0..9999) {
            if (a * i + b * j > n) continue
            if ((n - (a * i + b * j)) % c == 0L) {
                val k = (n - (a * i + b * j)) / c
                min = Math.min(min, i + j + k.toInt())
            }
        }
    }
    return min
}