package abc

import utilities.MathSample
import utilities.debugCount
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val b = (0 until n).map { sc.next().toLong() }
    val c = (0 until n).map { sc.next().toLong() }
    println(problem077c(n, a, b, c))
}

fun problem077c(
    n: Int,
    a: List<Long>,
    b: List<Long>,
    c: List<Long>
): Long {
    var answer = 0L
    val a = a.sorted()
    val b = b.sorted()
    val c = c.sorted()

    fun lowerBound(list: List<Long>, key: Long): Int {
        var ng = -1
        var ok = list.size

        while (ok - ng > 1) {
            val mid = (ok + ng) / 2
            if (list[mid] >= key) ok = mid else ng = mid
        }
        return ok
    }

    for (i in b) {
        answer += lowerBound(a, i).toLong() * (n - lowerBound(c, i + 1))
    }

    return answer
}