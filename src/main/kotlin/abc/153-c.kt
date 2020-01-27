package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val h = (0 until n).map { sc.next().toLong() }
    println(problem153c(n, k, h))
}

fun problem153c(n: Int, k: Int, h: List<Long>): Long {
    var count = 0L
    var k = k
    val h = h.sortedDescending()
    for (i in 0 until n) {
        if (k != 0) {
            k--
        } else {
            count += h[i]
        }
    }
    return count
}