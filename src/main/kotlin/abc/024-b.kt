package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val t = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem024b(n, t, a))
}

fun problem024b(n: Int, t: Int, a: List<Int>): Int {
    var sum = 0
    var openUntil = 0
    for (i in 0 until n) {
        val ai = a[i]
        sum += t - Math.max(0, openUntil - ai)
        openUntil = ai + t
    }
    return sum
}