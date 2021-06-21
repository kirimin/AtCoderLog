package other_contests.zone

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val d = sc.nextInt()
    val h = sc.nextInt()
    val dh = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    println(problem2021b(n, d, h, dh))
}

fun problem2021b(n: Int, d: Int, h: Int, dh: List<Pair<Int, Int>>): Double {
    var max = 0.0
    var maxi = 0
    for (i in 0 until n) {
        val katamuki = (dh[i].first - d).toDouble() / (dh[i].second - h)
        if (max <= katamuki) {
            max = katamuki
            maxi = i
        }
    }
    debugLog(maxi)
    val tmp = (dh[maxi].first - d).toDouble() / (dh[maxi].second - h)
    for (i in 0..1000000) {
        val i = i / 100.0
        val tmp2 = i / tmp
        val tmp3 = (0 - d) / (tmp2 - h)
        debugLog(i, tmp, tmp2, tmp3)
        if ((tmp3 * 1000000).toLong() == (tmp * 1000000).toLong()) return tmp2
    }
    return 0.0
}