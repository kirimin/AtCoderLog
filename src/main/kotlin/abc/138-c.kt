package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val v = (0 until n).map { sc.next().toInt() }
    println(problem138c(n, v))
}

fun problem138c(n: Int, v: List<Int>): Double {
    val list = v.map { it.toDouble() }.sorted().toMutableList()
    var i = 0
    while (list.size > 1) {
        val new = (list[0] + list[1]) / 2.0
        list.removeAt(0)
        list.removeAt(0)
        list.add(0, new)
        i++
    }
    return list[0]
}

// A + B / 2 = 新しい具材