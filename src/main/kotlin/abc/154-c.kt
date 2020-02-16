package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem154c(n, a))
}

fun problem154c(n: Int, a: List<Long>): String {
    val a = a.sorted()
    var res = "YES"
    var prev = -1L
    for (i in 0 until n) {
        if (a[i] == prev) res = "NO"
        prev = a[i]
    }
    return res
}