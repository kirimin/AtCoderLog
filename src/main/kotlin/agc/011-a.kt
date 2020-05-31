package agc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val c = sc.nextLong()
    val k = sc.nextLong()
    val t = (0 until n).map { sc.next().toLong() }
    println(problem011a(n, c, k, t))
}

fun problem011a(n: Int, c: Long, k: Long, t: List<Long>): Int {
    val t = t.sorted()
    val bus = mutableListOf<MutableList<Long>>()
    bus.add(mutableListOf())
    for (i in 0 until n) {
        if (bus.last().size.toLong() == c || (bus.last().isNotEmpty() && t[i] - bus.last()[0] > k)) {
            bus.add(mutableListOf())
        }
        bus.last().add(t[i])
    }
    return bus.count()
}