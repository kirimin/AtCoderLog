package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until 2 * n).map { sc.next() }
    println(problem222c(n, m, a))
}

fun problem222c(n: Int, m: Int, a: List<String>): String {
    var next = mutableListOf<Pair<Int, Int>>()
    for (i in 0 until 2 * n) {
        next.add(i to 0)
    }
    var list: List<Pair<Int, Int>>
    for (i in 0 until m) {
        list = next.sortedBy { it.first }.sortedByDescending { it.second }
        next = mutableListOf()
        for (j in 0 until n) {
            val one = a[list[2 * j].first][i]
            val two = a[list[2 * j + 1].first][i]
            if (one == 'G') {
                when (two) {
                    'C' -> {
                        next.add(list[2 * j].first to list[2 * j].second + 1)
                        next.add(list[2 * j + 1].first to list[2 * j + 1].second)
                    }
                    'P' -> {
                        next.add(list[2 * j].first to list[2 * j].second)
                        next.add(list[2 * j + 1].first to list[2 * j + 1].second + 1)
                    }
                    else -> {
                        next.add(list[2 * j].first to list[2 * j].second)
                        next.add(list[2 * j + 1].first to list[2 * j + 1].second)
                    }
                }
            } else if (one == 'C') {
                when (two) {
                    'P' -> {
                        next.add(list[2 * j].first to list[2 * j].second + 1)
                        next.add(list[2 * j + 1].first to list[2 * j + 1].second)
                    }
                    'G' -> {
                        next.add(list[2 * j].first to list[2 * j].second)
                        next.add(list[2 * j + 1].first to list[2 * j + 1].second + 1)
                    }
                    else -> {
                        next.add(list[2 * j].first to list[2 * j].second)
                        next.add(list[2 * j + 1].first to list[2 * j + 1].second)
                    }
                }
            } else {
                when (two) {
                    'G' -> {
                        next.add(list[2 * j].first to list[2 * j].second + 1)
                        next.add(list[2 * j + 1].first to list[2 * j + 1].second)
                    }
                    'C' -> {
                        next.add(list[2 * j].first to list[2 * j].second)
                        next.add(list[2 * j + 1].first to list[2 * j + 1].second + 1)
                    }
                    else -> {
                        next.add(list[2 * j].first to list[2 * j].second)
                        next.add(list[2 * j + 1].first to list[2 * j + 1].second)
                    }
                }
            }
        }
    }
    return next.sortedBy { it.first }.sortedByDescending { it.second }.map { it.first + 1 }.joinToString("\n")
}