package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val k = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    val b = (0 until m).map { sc.next().toLong() }
    println(problem172c(n, m, k, a, b))
}

fun problem172c(
    n: Int,
    m: Int,
    k: Long,
    a: List<Long>,
    b: List<Long>
): Int {
    val aS = mutableListOf<Long>()
    aS.add(0)
    for (i in 0 until n) {
        aS.add(aS[i] + a[i])
    }
    val bS = mutableListOf<Long>()
    bS.add(0)
    for (i in 0 until m) {
        bS.add(bS[i] + b[i])
    }
    var max = 0
    for (i in 0 until aS.size) {
        val aC = k - aS[i]
        if (aC < 0) break
        val bsResult = bS.binarySearch(aC)
        val j = if (bsResult >= 0) {
            bsResult
        } else {
            -bsResult - 2
        }
        debugLog(i, j)
        if (aS[i] + bS[j] > k) continue
        max = Math.max(max, i + j)

    }
    return max
}