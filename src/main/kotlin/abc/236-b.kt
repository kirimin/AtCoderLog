package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n * 4 - 1).map { sc.next().toInt() }
    println(problem236b(n, a))
}

fun problem236b(n: Int, a: List<Int>): Int {
    return a.groupBy { it }.toList().sortedBy { it.second.count() }[0].first
}