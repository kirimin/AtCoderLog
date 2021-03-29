package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem194c(n, a))
}

fun problem194c(n: Int, a: List<Long>): Long {
    /**
     * Doubleを使わないpow
     */
    fun longPow(a: Long, b: Long, needMod: Boolean = false): Long {
        /***
         * 10^9 + 7
         */
        val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()
        var ans = 1L
        for (i in 0 until b) {
            ans *= a
            if (needMod) ans %= mod
        }
        return ans
    }

    val grouping = a.groupBy { it }.toList()
    var sum = 0L
    for (i in 0 until grouping.size) {
        for (j in i + 1 until grouping.size) {
            sum += longPow(grouping[i].first - grouping[j].first, 2) * grouping[i].second.size * grouping[j].second.size
        }
    }
    return sum
}