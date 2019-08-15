package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val x = sc.next().toLong()
    val l = (0 until n).map { sc.next().toLong() }
    println(problem130b(n, x, l))
}

fun problem130b(n: Long, x: Long, l: List<Long>): Int {
    fun log(vararg values: Any) {
        debugLog(values)
    }
    var d = 1L
    var count = 1
    (1..n.toInt()).forEach { i ->
        d = (d - 1) + l[i - 1]
        log(d, count, d <= x)
        if (d <= x) {
            count++
        }
        d++
    }
    return count
}

// 0 3 4 5
// 0 1 2 3
// 0 ->
// (1 - 1) + 3 = 3 ->
// (4 - 1) + 4 = 7 ->
// (8 - 1) + 5 = 12