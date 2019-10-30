package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val c = sc.nextInt()
    val b = (0 until m).map { sc.next().toInt() }
    val a = (0 until n).map { (0 until m).map { sc.next().toInt() } }
    println(problem121b(n, m, c, b, a))
}

fun problem121b(
    n: Int,
    m: Int,
    c: Int,
    b: List<Int>,
    a: List<List<Int>>
): Int {
    var ans = 0
    for (i in 0 until n) {
        val ai = a[i]
        var sum = 0
        for (j in 0 until m) {
            sum += ai[j] * b[j]
        }
        sum += c
        if (sum > 0) ans++
    }
    return ans
}