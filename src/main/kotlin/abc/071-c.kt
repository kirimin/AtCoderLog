package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem071c(n, a))
}

fun problem071c(n: Int, a: List<Long>): Long {
    val map = mutableMapOf<Long, Int>()
    for (i in 0 until n) {
        val ai = a[i]
        if (map[ai] == null) {
            map[ai] = 1
        } else {
            map[ai] = map[ai]!! + 1
        }
    }
    val usable = map.filter { it.value >= 2 }.map { it.key to it.value }.sortedBy { it.first }
    if (usable.isEmpty()) return 0
    val x = usable[usable.size - 1]
    if (x.second >= 4) {
        return x.first * x.first
    } else {
        if (usable.size < 2) return 0
        val y = usable[usable.size - 2]
        return x.first * y.first
    }
}