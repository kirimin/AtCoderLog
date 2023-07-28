package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val q = sc.nextInt()
    val query = (0 until q).map {
        val num = sc.next().toInt()
        if (num == 1) {
            Triple(num, sc.next().toLong(), sc.next().toLong())
        } else {
            Triple(num, sc.next().toLong(), 0L)
        }
    }
    println(problem283b(n, a, q, query))
}

fun problem283b(n: Int, a: List<Long>, q: Int, query: List<Triple<Int, Long, Long>>): String {
    val a = a.toMutableList()
    val ans = mutableListOf<Long>()
    for (i in 0 until q) {
        if (query[i].first == 1) {
            a[query[i].second.toInt() - 1] = query[i].third
        } else {
            ans.add(a[query[i].second.toInt() - 1])
        }
    }
    return ans.joinToString("\n")
}