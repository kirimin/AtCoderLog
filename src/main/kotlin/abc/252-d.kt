package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem252d(n, a))
}

fun problem252d(n: Int, a: List<Int>): Long {
    val count = LongArray(2 * 1_00000 + 1)
    for (i in 0 until n) {
        count[a[i]] += 1L
    }
    for (i in 0 until count.size - 1) {
        count[i + 1] += count[i]
    }
    var ans = 0L
    for (j in 0 until n) {
        ans += count[a[j] - 1] * (n - count[a[j]]).toLong()
    }
    return ans
}