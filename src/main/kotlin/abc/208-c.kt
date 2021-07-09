package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem208c(n, k, a))
}

fun problem208c(n: Int, k: Long, a: List<Long>): String {
    val div = k / n
    var mod = k % n
    val ans = LongArray(n) { div }
    val sorted = a.mapIndexed { index, l -> index to l }.sortedBy { it.second }
    for (i in 0 until n) {
        if (mod == 0L) break
        ans[sorted[i].first]++
        mod--
    }
    return ans.joinToString("\n")
}