package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextLong()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem130d(n, k, a))
}

fun problem130d(n: Int, k: Long, a: List<Int>): Long {
    var ans = 0L

    fun lowerBound(list: LongArray, key: Long, left: Int): Int {
        var ng = -1
        var ok = list.size

        while (ok - ng > 1) {
            val mid = (ok + ng) / 2
            if (list[mid] - list[left] >= key) ok = mid else ng = mid
        }
        return ok
    }

    val s = LongArray(n + 1)
    for (i in 0 until n) {
        s[i + 1] = s[i] + a[i]
    }
    var left = 0
    var right = 1
    while (left < n) {
        if (s[right] - s[left] >= k) {
            ans += n - right + 1
            left++
            right = left + 1
        } else {
            right = lowerBound(s, k, left)
            if (right > n) {
                left++
                right = left + 1
            }
        }
    }
    return ans
}