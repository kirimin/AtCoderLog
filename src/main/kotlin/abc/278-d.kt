package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val q = sc.nextInt()
    val query = (0 until q).map {
        val t = sc.next().toInt()
        if (t == 2) {
            Triple(t, sc.next().toLong(), sc.next().toLong())
        } else {
            Triple(t, sc.next().toLong(), 0L)
        }
    }
    println(problem278d(n, a, q, query))
}

fun problem278d(n: Int, a: List<Long>, q: Int, query: List<Triple<Int, Long, Long>>): String {
    var base = 0L
    val ans = mutableListOf<Long>()
    var diff = mutableMapOf<Int, Pair<Int, Long>>()
    var gen = 0
    for (i in 0 until n) {
        diff[i] = Pair(gen, a[i])
    }
    for (j in 0 until q) {
        val (t, i, x) = query[j]
        when (t) {
            1 -> {
                base = i
                gen++
            }

            2 -> {
                if (diff[i.toInt() - 1]!!.first == gen) {
                    diff[i.toInt() - 1] = Pair(gen, diff[i.toInt() - 1]!!.second + x)
                } else {
                    diff[i.toInt() - 1] = Pair(gen, x)
                }
            }

            3 -> {
                if (diff[i.toInt() - 1]!!.first == gen) {
                    ans.add(base + diff[i.toInt() - 1]!!.second)
                } else {
                    ans.add(base)
                }
            }
        }
    }
    return ans.joinToString("\n")
}