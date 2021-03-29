package arc

import utilities.debugLog
import java.math.BigInteger
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    val lr = (0 until t).map { sc.nextLong() to sc.nextLong() }
    println(problem112a(t, lr))
}

fun problem112a(t: Int, lr: List<Pair<Long, Long>>): String {
    val ans = mutableListOf<Long>()
    for (case in 0 until t) {
        val (l, r) = lr[case]
        if (l == 0L && r == 0L) {
            ans.add(1)
            continue
        }
        val n = (r - l * 2 + 1).toBigInteger()
        if (n <= BigInteger.ZERO) {
            ans.add(0)
            continue
        }
        ans.add((n * (n + BigInteger.valueOf(1)) / BigInteger.valueOf(2)).toLong())
    }
    return ans.joinToString("\n")
}