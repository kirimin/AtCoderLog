package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextLong()
    val s = (0 until n).map { sc.next().toLong() }
    println(problem032c(n, k, s))
}

fun problem032c(n: Int, k: Long, s: List<Long>): Int {
    if (s.contains(0)) {
        return n
    }

    var mul = 1L
    var max = 0
    var right = 0
    for (left in 0 until n) {
        while (right < n && mul * s[right] <= k) {
            mul *= s[right]
            right++
        }
        max = Math.max(max, right - left)
        if (right == left) right++ else mul /= s[left]
    }
    return max
}