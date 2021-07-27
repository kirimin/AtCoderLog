package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    println(problem163d(n, k))
}

fun problem163d(n: Int, k: Int): Long {
    /**
     * 公差1の等差数列の和
     */
    fun arithmeticSequence(start: Long, end: Long): Long {
        return (start + end) * (end - start + 1) / 2
    }

    /***
     * 10^9 + 7
     */
    val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()

    var sum = 0L
    for (i in k..n + 1L) {
        val s = arithmeticSequence(0, i - 1)
        val e = arithmeticSequence(n - i + 1, n.toLong())
        val tmp = e - s + 1
        sum += tmp
        sum %= mod
    }
    return sum
}