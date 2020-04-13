package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem161b(n, m, a))
}

fun problem161b(n: Int, m: Int, a: List<Int>): String {
    val a = a.sorted()
    val x = a.sum() / (4.0 * m)
    val take = a.takeLast(m)
    for (i in 0 until take.size) {
        if (take[i] < x) return "No"
    }
    return "Yes"
}