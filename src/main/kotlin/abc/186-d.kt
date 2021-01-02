package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem186d(n, a))
}

fun problem186d(n: Int, a: List<Long>): Long {
    val a = a.sorted()
    val sum = a.sum()
    debugLog(a)
    debugLog(Math.abs(31 - 26) + Math.abs(41 - 26) + Math.abs(53 - 26) + Math.abs(59 - 26))
    debugLog(Math.abs((31 + 41 + 53 + 59) - 26 * 4))
    var ans = 0L
    var used = 0L
    for (i in 0 until n) {
        val ai = a[i]
        used += ai
        ans += Math.abs(sum - used - ai * (n - (i + 1)))
        debugLog(ai, (n - (i + 1)), ans)

    }
    debugLog(ans)

    var ans2 = 0L
    for (i in 0 until n) {
        val ai = a[i]
        for (j in 0 until i) {
            val aj = a[j]
            ans2 += Math.abs(ai - aj)
            debugLog(ai, aj, ans2)
        }
    }
    return ans2
}

// 31 - 26 +