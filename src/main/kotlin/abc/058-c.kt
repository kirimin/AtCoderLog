package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val s = (0 until n).map { sc.next() }
    println(problem058c(n, s))
}

fun problem058c(n: Long, s: List<String>): String {
    var ans = ""
    ('a'..'z').forEach { char ->
        var count = Integer.MAX_VALUE
        s.forEach {
            val tmpCount = it.filter { it == char }.count()
            count = Math.min(count, tmpCount)
        }
        if (count != 0) {
            (1..count).forEach {
                ans += char
            }
        }
    }
    return ans
}