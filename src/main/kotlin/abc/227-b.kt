package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next().toInt() }
    println(problem227b(n, s))
}

fun problem227b(n: Int, s: List<Int>): Int {
    val set = hashSetOf<Long>()
    for (a in 1..1000L) {
        for (b in 1..1000L) {
            set.add(4 * a * b + 3 * a + 3 * b)
        }
    }
    var count = 0
    for (i in 0 until n) {
        if (!set.contains(s[i].toLong())) count++
    }
    return count
}