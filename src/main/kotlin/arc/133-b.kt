package arc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val p = (0 until n).map { sc.next().toInt() }
    val q = (0 until n).map { sc.next().toInt() }
    println(problem133b(n, p, q))
}

fun problem133b(n: Int, p: List<Int>, q: List<Int>): Int {
    var max = 0
    for (i in 0 until n) {
        debugLog()
        var right = - 1
        var count = 0
        for (j in i until n) {
            val pj = p[j]
            for (k in right + 1 until n) {
                val qk = q[k]
                if (qk % pj == 0) {
                    debugLog(pj, qk)
                    right = k
                    count++
                    break
                }
                if (i == n - 1) {
                    right = n - 1
                }
            }
            if (right == n - 1) {
                break
            }
        }
        max = Math.max(max, count)
    }
    return max
}