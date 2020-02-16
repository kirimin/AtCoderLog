package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val p = (0 until n).map { sc.next().toLong() }
    println(problem153d(n, k, p))
}

fun problem153d(n: Int, k: Int, p: List<Long>): Double {
    fun sum(n: Long): Long {
        var sum = 0L
        for (i in 1..n) {
            sum += i
        }
        return sum
    }
    val list = DoubleArray(n + 1) { 0.0 }
    for (i in 0 until n) {
        val pi = p[i]
        list[i + 1] = list[i] + sum(pi) / pi.toDouble()
    }
    var res = 0.0
    for (i in 0..n - k) {
        val v = list[k + i] - list[i]
        if (res < v) res = v
    }
    return res
}