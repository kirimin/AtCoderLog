package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val m = sc.nextInt()
    val t = sc.nextLong()
    val ab = (0 until m).map { sc.next().toLong() to sc.next().toLong() }
    println(problem185b(n, m, t, ab))
}

fun problem185b(n: Long, m: Int, t: Long, ab: List<Pair<Long, Long>>): String {
    var battery = n
    var time = 0L
    for (i in 0 until m) {
        val (a, b) = ab[i]
        val diff = a - time
        battery -= diff
        time += diff
        if (battery <= 0) return "No"
        val charge = b - a
        battery = Math.min(charge + battery, n)
        time += b - a
    }
    battery -= t - time
    if (battery <= 0) return "No"
    return "Yes"
}