package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val l = sc.nextLong()
    val r = sc.nextLong()
    println(problem133c(l, r))
}

fun problem133c(l: Long, r: Long): Long {
    var min = Long.MAX_VALUE
    for (i in l..r) {
        for (j in i+1..r) {
            min = Math.min(min, (i * j) % 2019)
            if (min == 0L) return 0
        }
    }
    return min
}