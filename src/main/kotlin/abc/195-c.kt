package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem195c(n))
}

fun problem195c(n: Long): Long {
    var ans = 0L
    if (999L < n) {
        ans += n - 999
    }
    if (999999L < n) {
        ans += n - 999999L
    }
    if (999999999L < n) {
        ans += n - 999999999L
    }
    if (999999999999L < n) {
        ans += n - 999999999999
    }
    if (999999999999999L < n) {
        ans += n - 999999999999999L
    }
    return ans
}