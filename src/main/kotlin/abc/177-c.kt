package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem177c(a, n))
}

fun problem177c(a: List<Long>, n: Int): Long {
    /***
     * 10^9 + 7
     */
    val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()
    val sum = a.sum()
    var sumSub = sum
    var ans = 0L
    for (i in 0 until n) {
        ans += (a[i] * ((sumSub - a[i]) % mod)) % mod
        sumSub -= a[i]
    }

    return ans % mod
}

// 1 * (2..7) = 1 * (sum(1..7) - 1)