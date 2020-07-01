package other_contests.company.nikkei

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val d = (0 until n).map { sc.next().toInt() }
    println(problemnikkei20192b(n, d))
}

fun problemnikkei20192b(n: Int, d: List<Int>): Long {
    if (d[0] != 0) return 0

    val mod = fun(n: Long) = n % 998244353
    val groped = d.sorted().groupBy { it }.toList()
    if (groped[0].second.size != 1) return 0
    var ans = 1L
    for (i in 1 until groped.size) {
        if (groped[i].first != groped[i - 1].first + 1) return 0
        for (j in groped[i].second.indices) {
            ans = mod(ans * groped[i- 1].second.size)
        }
    }
    return ans
}