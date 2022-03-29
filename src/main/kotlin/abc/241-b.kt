package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val b = (0 until m).map { sc.next().toLong() }
    println(problem241b(n, m, a, b))
}

fun problem241b(n: Int, m: Int, a: List<Long>, b: List<Long>): String {
    val a = a.toMutableList()
    for (i in 0 until m) {
        val bi = b[i]
        val index = a.indexOf(bi)
        if (index != -1) {
            a[index] = -1
        } else {
            return "No"
        }
    }
    return "Yes"
}