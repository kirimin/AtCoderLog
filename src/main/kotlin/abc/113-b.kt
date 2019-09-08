package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val t = sc.nextInt()
    val a = sc.nextInt()
    val h = (0 until n).map { sc.next().toInt() }
    println(problem113b(n, t, a, h))
}

fun problem113b(n: Int, t: Int, a: Int, h: List<Int>): Int {
    var tmp = Double.MAX_VALUE
    var ans = 0
    for (i in 0 until n) {
        val temple = t - h[i] * 0.006
        val new = Math.abs(a - temple)
        if(tmp > new) {
            ans = i + 1
        }
        tmp = Math.min(tmp, new)
    }
    return ans
}