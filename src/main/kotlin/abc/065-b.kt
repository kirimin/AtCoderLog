package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem065b(n, a))
}

fun problem065b(n: Int, a: List<Int>): Int {
    var current = 1
    var count = 0
    val set = hashSetOf<Int>()
    while (current != 2) {
        current = a[current - 1]
        if (set.contains(current)) return -1
        set.add(current)
        count++
    }
    return count
}