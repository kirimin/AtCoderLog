package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val xy = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    println(problem224c(n, xy))
}

fun problem224c(n: Int, xy: List<Pair<Long, Long>>): Int {
    var count = 0
    for (i in 0 until n) {
        val xy1 = xy[i]
        for (j in i + 1 until n) {
            val xy2 = xy[j]
            for (k in j + 1 until n) {
                val xy3 = xy[k]
                val ans = Math.abs(
                    (xy1.first - xy3.first) * (xy2.second - xy3.second) -
                            (xy2.first - xy3.first) * (xy1.second - xy3.second)
                )
                if (ans > 0) count++
            }
        }
    }
    return count
}