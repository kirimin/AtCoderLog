package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextInt()
    val vp = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    println(problem189b(n, x, vp))
}

fun problem189b(n: Int, x: Int, vp: List<Pair<Int, Int>>): Int {
    var sum = 0L
    for (i in 0 until n) {
        val (v, p) = vp[i]
        val tmp = v * p
//        debugLog(tmp)
        sum += tmp
        if (sum > x * 100L) return i + 1
    }
    return -1
}