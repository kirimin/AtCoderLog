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
    val ans = LongArray(q)
    val kSorted = k.mapIndexed { index, l -> l to index }.sortedBy { it.first }
    val memo = Array(q + 1) { 0 to 0 }
    for (i in 0 until q) {
        var (ki, index) = kSorted[i]
        var count = 0
        val (m1, m2) = memo[i]
        ki += m2
        for (j in m1 until n) {
            val aj = a[j]
            if (aj <= ki) {
                ki++
                count++
                memo[i + 1] = j + 1 to count
            } else {
                break
            }
        }
        ans[index] = (ki)
    }
    return ans.joinToString("\n")
}