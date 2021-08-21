package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val b = (0 until m).map { sc.next().toLong() }
    println(problem212c(n, m, a, b))
}

fun problem212c(n: Int, m: Int, a: List<Long>, b: List<Long>): Long {
    val a = a.map { it to "a" }
    val b = b.map { it to "b" }
    val ab = (a + b).sortedBy { it.first }
    var min = Long.MAX_VALUE
    var prev = ""
    var prevNum = -1L
    for (i in 0 until ab.size) {
        val abi = ab[i]
        if (prev != abi.second) {
            if (prevNum != -1L) {
                min = Math.min(Math.abs(prevNum - abi.first), min)
            }
        }
        prevNum = abi.first
        prev = abi.second
    }
    return min
}