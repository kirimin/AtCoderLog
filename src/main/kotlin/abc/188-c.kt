package abc

import java.util.*

fun main(args: Array<String>) {
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


    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val nPow = longPow(2, n.toLong())
    val a = (0 until nPow).mapIndexed { i, _ -> i + 1 to sc.next().toLong() }
    println(problem188c(n, nPow, a))
}

fun problem188c(n: Int, nPow: Long, a: List<Pair<Int, Long>>): Int {
    fun compute(a: List<Pair<Int, Long>>): List<Pair<Int, Long>> {
        if (a.size <= 2) return a
        val newList = mutableListOf<Pair<Int, Long>>()
        for (i in 0 until a.size step 2) {
            if (a[i].second > a[i + 1].second) {
                newList.add(a[i])
            } else {
                newList.add(a[i + 1])
            }
        }
        return compute(newList)
    }
    val ans = compute(a)
    return ans.minBy { it.second }!!.first
}
