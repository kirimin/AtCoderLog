package abc

import utilities.debugCount
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem138b(n, a))
}

fun problem138b(n: Long, a: List<Long>): Double {
    var ans = 0.0
    a.forEach {
        ans += 1.0 / it
    }
    return 1.0 / ans
}