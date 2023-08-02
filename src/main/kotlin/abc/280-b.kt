package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next().toLong() }
    println(problem280b(n, s))
}

fun problem280b(n: Int, s: List<Long>): String {
    val ans = mutableListOf<Long>()
    var sum = 0L
    for (i in 0 until n) {
        val si = s[i]
        val tmp = si - sum
        sum += tmp
        ans.add(tmp)
    }
    return ans.joinToString(" ")
}