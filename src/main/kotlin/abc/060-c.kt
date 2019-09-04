package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val t = sc.nextLong()
    val tn = (0 until n).map { sc.next().toLong() }
    println(problem060c(n, t, tn))
}

fun problem060c(n: Long, t: Long, tn: List<Long>): Long {
    var sum = 0L
    var currentT = 0L
    for (i in tn.indices) {
        if (i >= tn.size - 1) {
            sum += t
            continue
        }
        val tiNext = tn[i + 1]
        if (currentT + t > tiNext) {
            sum += tiNext - currentT
            currentT = tiNext
        } else if(currentT + t <= tiNext) {
            sum += t
            currentT = tiNext
        }
    }
    return sum
}

// 1 current = 1000 sum = 1000
// 2 current = 1000 1000000