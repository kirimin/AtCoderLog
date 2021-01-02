package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    val nsk = (0 until t).map { Triple(sc.nextLong(), sc.nextLong(), sc.nextLong()) }
    println(problem186e(t, nsk))
}

fun problem186e(t: Int, nsk: List<Triple<Long, Long, Long>>): String {
    val ans = mutableListOf<Long>()
    for (i in 0 until t) {
        val (n, s, k) = nsk[i]
        val div = (n - s) % k
        if (div == 0L) {
            ans.add((n - s) / k)
            continue
        }
        val zure = (n % k)
        if (zure == 0L) {
            ans.add(-1)
            continue
        }
        val roundCost = n / k + 1
        debugLog(zure, roundCost)
        val diff = Math.abs(roundCost * k - n)
        debugLog(diff)
    }
    return ans.joinToString("\n")
}