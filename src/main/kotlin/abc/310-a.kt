package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val p = sc.nextInt()
    val q = sc.nextInt()
    val d = (0 until n).map { sc.next().toInt() }
    println(problem310a(n, p, q, d))
}

fun problem310a(n: Int, p: Int, q: Int, d: List<Int>): Int {
    var min = p
    for (i in 0 until n) {
        min = Math.min(min, d[i] + q)
    }
    return min
}