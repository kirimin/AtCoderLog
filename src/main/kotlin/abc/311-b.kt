package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val d = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem311b(n, d, s))
}

fun problem311b(n: Int, d: Int, s: List<String>): Int {
    var max = 0
    var count = 0
    for (i in 0 until d) {
        var isOk = true
        for (j in 0 until n) {
            if (s[j][i] == 'x') {
                isOk = false
                break
            }
        }
        if (isOk) {
            count++
            max = Math.max(max, count)
        } else {
            count = 0
        }
    }
    return max
}