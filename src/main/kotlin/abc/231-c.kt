package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val q = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val x = (0 until q).map { sc.next().toLong() }
    println(problem231c(n, q, a, x))
}

fun problem231c(n: Int, q: Int, a: List<Long>, x: List<Long>): String {
    val a = a.sorted()
    fun lowerBound(list: List<Long>, key: Long): Int {
        var ng = -1
        var ok = list.size

        while (ok - ng > 1) {
            val mid = (ok + ng) / 2
            if (list[mid] >= key) ok = mid else ng = mid
        }
        return ok
    }
    val ans = mutableListOf<Long>()
    for (i in 0 until q) {
        val xi = x[i]
        val index = lowerBound(a, xi)
        ans.add((n - index).toLong())
    }
    return ans.joinToString("\n")
}