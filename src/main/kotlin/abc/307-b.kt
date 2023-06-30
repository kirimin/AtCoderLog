package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem307b(n, s))
}

fun problem307b(n: Int, s: List<String>): String {
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i == j) continue
            val str = s[i] + s[j]
            if (str.take(str.length / 2) == (str.takeLast(str.length / 2).reversed())) {
                return "Yes"
            }
        }
    }
    return "No"
}