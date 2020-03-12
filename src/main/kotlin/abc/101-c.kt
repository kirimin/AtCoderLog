package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem101c(n, k, a))
}

fun problem101c(n: Int, k: Int, a: List<Int>): Int {
    if (n == k) return 1
    return ((n - 1) / (k - 1) + if ((n - 1) % (k - 1) != 0) 1 else 0)
}