package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n - 1).map { sc.next().toInt() }
    println(problem163c(n, a))
}

fun problem163c(n: Int, a: List<Int>): String {
    val map = mutableMapOf<Int, Int>()
    for (i in 0 until n - 1) {
        val ai = a[i]
        if (map.containsKey(ai)) {
            map[ai] = map[ai]!! + 1
        } else {
            map[ai] = 1
        }
    }
    val list = mutableListOf<Int>()
    for (i in 1..n) {
        if (map.containsKey(i)) {
            list.add(map[i]!!)
        } else {
            list.add(0)
        }
    }
    return list.joinToString("\n")
}