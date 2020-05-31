package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem041c(n, a))
}

fun problem041c(n: Int, a: List<Long>): String {
    return a.mapIndexed { index, l -> index to l }
        .sortedBy { it.second }
        .reversed()
        .map { it.first + 1 }
        .joinToString("\n")
}