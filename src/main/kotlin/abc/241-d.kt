package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val q = sc.nextInt()
    val query = (0 until q).map {
        val i = sc.next().toInt()
        val x = sc.next().toLong()
        if (i == 1) {
            Triple(i, x, 0)
        } else {
            val k = sc.next().toInt()
            Triple(i, x, k)
        }
    }
    println(problem241d(q, query))
}

fun problem241d(q: Int, query: List<Triple<Int, Long, Int>>): String {
    // 宣言
    val tree = TreeSet<Pair<Long, Int>> { x: Pair<Long, Int>, y: Pair<Long, Int> ->
        val tmp = x.first.compareTo(y.first)
        if (tmp == 0) {
            x.second.compareTo(y.second)
        } else {
            tmp
        }
    }
    val ans = mutableListOf<Long>()
    for (i in 0 until q) {
        when (query[i].first) {
            1 -> {
                tree.add(query[i].second to i)
            }
            2 -> {
                val (_, x, k) = query[i]
                var next = x to Int.MAX_VALUE
                val removes = mutableListOf<Pair<Long, Int>>()
                for (j in 0 until k) {
                    next = tree.floor(next) ?: (-1L to -1)
                    if (next.first == -1L) break
                    removes.add(next)
                    tree.remove(next)
                }
                ans.add(next.first)
                tree.addAll(removes)
            }
            3 -> {
                val (_, x, k) = query[i]
                var next = x to -1
                val removes = mutableListOf<Pair<Long, Int>>()
                for (j in 0 until k) {
                    next = tree.ceiling(next) ?: (-1L to -1)
                    if (next.first == -1L) break
                    removes.add(next)
                    tree.remove(next)
                }
                ans.add(next.first)
                tree.addAll(removes)
            }
        }
    }
    return ans.joinToString("\n")
}