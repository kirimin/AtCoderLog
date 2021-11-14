package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val ab = (0 until n - 1).map { sc.next().toInt() to sc.next().toInt() }
    println(problem225b(n, ab))
}

fun problem225b(n: Int, ab: List<Pair<Int, Int>>): String {
    val ki = Array(n) { mutableListOf<Int>() }
    for (i in 0 until n - 1) {
        val (a, b) = ab[i]
        ki[a - 1].add(b - 1)
        ki[b - 1].add(a - 1)
    }
    for (i in 0 until n - 1) {
        if (ki[i].size != 1 && ki[i].size != n - 1) return "No"
    }
    return "Yes"
}