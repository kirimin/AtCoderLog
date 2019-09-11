package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem057c(n))
}

fun problem057c(n: Long): Int {

    var ans = n.toString().length
    var a = 0L
    while (a * a <= n) {
        a++
        if (n % a != 0L) continue
        val b = n / a
        val cur = Math.max(a.toString().length, b.toString().length)
        if (ans > cur) {
            debugLog(a, b)
            ans = cur
        }
    }
    return ans
}