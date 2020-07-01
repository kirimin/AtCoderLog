package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    val n = sc.nextInt()
    val p = (0 until n).map { sc.next().toInt() }
    println(problem170c(x, n, p))
}

fun problem170c(x: Int, n: Int, p: List<Int>): Int {
    if (n == 0) return x
    val p = p.toHashSet()
    var min = Integer.MAX_VALUE
    var minI = 0
    for (i in -100 until 200) {
        if (p.contains(i)) continue
        if (min > Math.abs(i - x)) {
            min = Math.abs(i - x)
            minI = i
        }
    }
    return minI
}