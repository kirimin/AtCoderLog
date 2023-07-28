package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val ab = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    println(problem288a(n, ab))
}

fun problem288a(n: Int, ab: List<Pair<Long, Long>>): String {
    val ans = mutableListOf<Long>()
    for (i in 0 until n) {
        ans.add(ab[i].first + ab[i].second)
    }
    return ans.joinToString("\n")
}