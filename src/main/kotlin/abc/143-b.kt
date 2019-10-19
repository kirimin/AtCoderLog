package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val d = (0 until n).map { sc.next().toInt() }
    println(problem143b(n, d))
}

fun problem143b(n: Int, d: List<Int>): Int {
    var ans = 0
    for (i in 0 until n) {
        for (j in i until n) {
            if (i != j) {
                ans += d[i] * d[j]
            }
        }
    }
    return ans
}