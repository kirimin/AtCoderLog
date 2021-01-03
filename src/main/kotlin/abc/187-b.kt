package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val xy = (0 until n).map { sc.next().toDouble() to sc.next().toDouble() }
    println(problem187b(n, xy))
}

fun problem187b(n: Int, xy: List<Pair<Double, Double>>): Int {
    var ans = 0
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            val xy1 = xy[i]
            val xy2 = xy[j]
            val tmp = (xy2.second - xy1.second) / (xy2.first - xy1.first)
            if (tmp in -1.0..1.0) ans++
        }
    }
    return ans
}