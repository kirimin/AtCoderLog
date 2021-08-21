package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val r1 = sc.nextLong()
    val c1 = sc.nextLong()
    val r2 = sc.nextLong()
    val c2 = sc.nextLong()
    println(problem184c(r1, c1, r2, c2))
}

fun problem184c(r1: Long, c1: Long, r2: Long, c2: Long): Int {
    if (r1 == r2 && c1 == c2) return 0
    if (r1 + c1 == r2 + c2 || r1 - c1 == r2 - c2) return 1
    if (Math.abs(r1 - r2) + Math.abs(c1 - c2) <= 3) return 1
    if ((r1 + c1 + r2 + c2) % 2 == 0L) return 2
    if (Math.abs(r1 - r2) + Math.abs(c1 - c2) <= 6) return 2
    if (Math.abs((r1 - c1) - (r2 - c2)) <= 3) return 2
    if (Math.abs((r1 + c1) - (r2 + c2)) <= 3) return 2
    return 3
}