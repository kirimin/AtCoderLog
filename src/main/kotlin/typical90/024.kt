package typical90

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextLong()
    val a = (0 until n).map { sc.next().toInt() }
    val b = (0 until n).map { sc.next().toInt() }
    println(problem024(n, k, a, b))
}

fun problem024(n: Int, k: Long, a: List<Int>, b: List<Int>): String {
    var diff = 0L
    for (i in 0 until n) {
        val ai = a[i]
        val bi = b[i]
        diff += Math.abs(bi - ai)
    }
    return if (diff <= k && diff % 2 == k % 2) "Yes" else "No"
}