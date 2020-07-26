package other_contests.code_festival

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem(s))
}

fun problem(s: String): String {
    val counts = s.toList().sorted().groupBy { it }.map { it.value.count() }
    val a = counts[0]
    val b = if (counts.size >= 2) counts[1] else 0
    val c = if (counts.size >= 3)  counts[2] else 0
    return if (Math.abs(a - b) < 2 && Math.abs(a - c) < 2 && Math.abs(b - c) < 2) "YES" else "NO"
}