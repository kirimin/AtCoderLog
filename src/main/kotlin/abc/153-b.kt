package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextLong()
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem153b(h, n, a))
}

fun problem153b(h: Long, n: Int, a: List<Int>): String {
    var h = h
    for (i in 0 until n) {
        h-= a[i]
    }
    return if (h > 0) "No" else "Yes"
}