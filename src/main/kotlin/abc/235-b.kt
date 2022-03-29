package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val h = (0 until n).map { sc.next().toLong() }
    println(problem235b(n, h))
}

fun problem235b(n: Int, h: List<Long>): Long {
    var ans = h[0]
    for (i in 1 until n) {
        if (ans < h[i]) {
            ans = h[i]
        } else {
            break
        }
    }
    return ans
}