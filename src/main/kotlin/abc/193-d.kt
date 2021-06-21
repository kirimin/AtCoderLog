package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val k = sc.nextInt()
    val s = sc.next()
    val t = sc.next()
    println(problem193d(k, s, t))
}

fun problem193d(k: Int, s: String, t: String): Double {
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

    fun compute(cards: String): Long {
        var score = 0L
        val sCounts = cards.map { it.toString().toInt() }.groupBy { it }
        for (i in 1..9) {
            score += i * longPow(10, sCounts[i]?.size?.toLong() ?: 0L)
        }
        return score
    }

    val total = (9L * k - 8) * (9L * k - 9)
    var win = 0L
    val sCounts = s.dropLast(1).map { it.toString().toInt() }.groupBy { it }
    val tCounts = t.dropLast(1).map { it.toString().toInt() }.groupBy { it }

    for (i in 1..9) {
        for (j in 1..9) {
            val sScore = compute(s.dropLast(1).plus(i.toString()))
            val tScore = compute(t.dropLast(1).plus(j.toString()))

            if (sScore > tScore) {
                if (i != j) {
                    win += (k - ((sCounts[i]?.size ?: 0) + (tCounts[i]?.size ?: 0))).toLong() *
                            (k - ((sCounts[j]?.size ?: 0) + (tCounts[j]?.size ?: 0))).toLong()
                } else {
                    win += (k - ((sCounts[i]?.size ?: 0) + (tCounts[i]?.size ?: 0))).toLong() *
                            (k - ((sCounts[j]?.size ?: 0) + (tCounts[j]?.size ?: 0)) - 1).toLong()
                }
            }
        }
    }
    return win.toDouble() / total.toDouble()
}