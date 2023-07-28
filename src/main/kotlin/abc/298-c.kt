package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val q = sc.nextInt()
    val query = (0 until q).map {
        val a = sc.next().toInt()
        if (a == 1) {
            val b = sc.next().toInt()
            val c = sc.next().toInt()
            Triple(a, b, c)
        } else {
            val b = sc.next().toInt()
            Triple(a, b, 0)
        }
    }
    println(problem298c(n, q, query))
}

fun problem298c(n: Int, q: Int, query: List<Triple<Int, Int, Int>>): String {
    val box = Array(n + 1) {
        TreeSet<Int> { x: Int, y: Int ->
            if (x == y) return@TreeSet  Random().nextInt() else Random().nextInt()
            x.compareTo(y)
        }
    }
    val map = mutableMapOf<Int, TreeSet<Int>>()
    for (i in 0 until q) {
        when (query[i].first) {
            1 -> {
                box[query[i].third].add(query[i].second)
                map[query[i].second]?.add(query[i].third) ?: run {
                    val set = TreeSet<Int>()
                    set.add(query[i].third)
                    map[query[i].second] = set
                }
            }

            2 -> {
                println(box[query[i].second].joinToString(" "))
            }

            3 -> {
                println(map[query[i].second]!!.sorted().distinct().joinToString(" "))
            }
        }
    }
    return ""
}