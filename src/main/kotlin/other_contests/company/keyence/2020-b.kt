package other_contests.company.keyence

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val xl = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    println(problem2020b(n, xl))
}

fun problem2020b(n: Int, xl: List<Pair<Long, Long>>): Int {
    val xl = xl.map { it.first - it.second to it.first + it.second } .sortedBy { it.second }
    var res = 0
    var cur = -Long.MAX_VALUE
    for (i in 0 until n) {
        if (cur > xl[i].first) continue
        res++
        cur = xl[i].second
    }
    return res
}