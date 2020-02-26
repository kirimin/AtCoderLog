package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val d = sc.nextInt()
    val x = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem092b(n, d, x, a))
}

fun problem092b(n: Int, d: Int, x: Int, a: List<Int>): Int {
    var res = 0
    for (i in 0 until n) {
        val ai = a[i]
        var count = 0
        for (j in 1..d) {
            val ans = count * ai + 1
            if (ans > d) break
            res++
            count++
        }
    }
    return res + x
}