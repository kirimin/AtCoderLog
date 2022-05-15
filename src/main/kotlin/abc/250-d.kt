package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem250d(n))
}

fun problem250d(n: Long): Int {
    fun sieveOfEratosthenes(n: Int): List<Int> {
        val prime = BooleanArray(n + 1) { true }
        for (i in 2..n) {
            for (j in i * 2..n step i) {
                prime[j] = false
            }
        }
        val ans = mutableListOf<Int>()
        for (i in 2..n) {
            if (prime[i]) {
                ans.add(i)
            }
        }
        return ans
    }
    val tmp = Math.pow(n.toDouble(), 1 / 3.0).toInt()
    val list = sieveOfEratosthenes(tmp)
    var count = 0
    for (i in 0 until list.size) {
        val p = list[i]
        for (j in i + 1 until list.size) {
            val q = list[j]
            try {
                if (Math.multiplyExact(
                        Math.multiplyExact(
                            Math.multiplyExact(p.toLong(), q.toLong()), q.toLong()
                        ), q.toLong()
                    ) <= n
                ) {
                    count++
                } else {
                    break
                }
            } catch (e : Exception) {
                break
            }
        }
    }
    return count
}