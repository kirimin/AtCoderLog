package abc

import utilities.debugLog
import java.util.*


fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem233d(n, k, a))
}

fun problem233d(n: Int, k: Long, a: List<Long>): Long {
    var count = 0L
    val s = LongArray(n + 1)
    for (i in 0 until n) {
        s[i + 1] = s[i] + a[i]
    }
    val map = mutableMapOf<Long, Long>()
    for (r in 1..n) {
        map[s[r - 1]] = (map[s[r - 1]] ?: 0) + 1
        count += map[s[r] - k] ?: 0
    }
    return count
}
