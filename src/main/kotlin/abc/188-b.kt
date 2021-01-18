package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    val b = (0 until n).map { sc.next().toInt() }
    println(problem188b(n, a, b))
}

fun problem188b(n: Int, a: List<Int>, b: List<Int>): String {
    var sum = 0L
    for (i in 0 until n) {
        sum += a[i] * b[i]
    }
    return if (sum == 0L) "Yes" else "No"
}