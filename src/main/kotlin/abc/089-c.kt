package abc

import utilities.debugCount
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem089c(n, s))
}

fun problem089c(n: Int, s: List<String>): Long {
    var count = 0L
    val list = (0..5).map { 0 }.toMutableList()
    for (i in 0 until n) {
        when (s[i].take(1)) {
            "M" -> list[0] += 1
            "A" -> list[1] += 1
            "R" -> list[2] += 1
            "C" -> list[3] += 1
            "H" -> list[4] += 1
            else -> {
            }
        }
    }
    for (i in 0 until list.size) {
        for (j in i until list.size) {
            for (k in j until list.size) {
                if (i != j && i != k && j != k) {
                    count += list[i].toLong() * list[j].toLong() * list[k].toLong()
                }
            }
        }
    }
    return count
}