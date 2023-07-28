package abc

import utilities.debugLog
import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val ab = (0 until n).map { sc.next() to sc.next() }
    println(problem308c(n, ab))
}

fun problem308c(n: Int, ab: List<Pair<String, String>>): String {
    val list = mutableListOf<Pair<Int, BigDecimal>>()
    for (i in 0 until n) {
        val (a, b) = ab[i]
        val ritsu = BigDecimal(a).divide(BigDecimal.valueOf(a.toLong(), 20) + BigDecimal.valueOf(b.toLong(), 20), RoundingMode.HALF_UP)
        list.add(i to ritsu)
    }
    return list.sortedByDescending { it.second }.map { it.first + 1 }.joinToString("\n")
}