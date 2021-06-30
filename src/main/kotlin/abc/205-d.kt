package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val q = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val k = (0 until q).map { sc.next().toLong() }
    println(problem205d(n, q, a, k))
}

fun problem205d(n: Int, q: Int, a: List<Long>, k: List<Long>): String {
    fun lowerBound(list: LongArray, key: Long): Int {
        var ng = -1
        var ok = list.size

        while (ok - ng > 1) {
            val mid = (ok + ng) / 2
            if (list[mid] >= key) ok = mid else ng = mid
        }
        return ok
    }

    val c = LongArray(n)
    for (i in 0 until n) {
        c[i] = a[i] - (i + 1)
    }
    val ans = LongArray(q)
    for (i in 0 until q) {
        val ki = k[i]
        if (c.last() < ki) {
            ans[i] = a.last() + (ki - c.last())
        } else {
            val j = lowerBound(c, ki)
            ans[i] = (a[j] - 1) - (c[j] - ki)
        }
    }
    return ans.joinToString("\n")
}