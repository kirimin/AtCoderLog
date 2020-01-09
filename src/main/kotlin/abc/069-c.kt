package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem069c(n, a))
}

fun problem069c(n: Int, a: List<Long>): String {
    val fours = a.count { it % 4 == 0L }
    val odds = a.count { it % 2 != 0L }
    val twoCount = a.count { it % 2 == 0L && it % 4 != 0L }
    val tmp = n - fours
    val tmp2 = Math.min(0, fours + 1 - tmp)
    val tmp3 = tmp2 + if (twoCount > 1) twoCount - 1 else 0
    return if (tmp3 == 0) "Yes" else "No"
}