package past

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = sc.nextInt()
    val b = sc.nextInt()
    val wv = (0 until n).map { sc.next().toInt() to sc.next().toLong() }
    println(problem011h(n, a, b, wv))
}

fun problem011h(n: Int, a: Int, b: Int, wv: List<Pair<Int, Long>>): Long {
    var max = 0L
    var aTake = mutableSetOf<Int>()
    fun search (i: Int, weight: Int, value: Long, takes: MutableSet<Int>) {
        if (weight > a) return
        if (i == n) {
            if (max < value) {
                aTake = takes
            }
            max = Math.max(max, value)
            return
        }
        val (wi, vi) = wv[i]
        val list = takes.toMutableSet()
        list.add(i)
        search(i + 1, weight + wi, value + vi, list)
        search(i + 1, weight, value, takes)
    }
    search(0, 0, 0, mutableSetOf())

    val wv2 = mutableListOf<Pair<Int, Long>>()
    for (i in 0 until n) {
        if (aTake.contains(i)) continue
        wv2.add(wv[i])
    }
    var max2 = 0L
    fun search2 (i: Int, weight: Int, value: Long) {
        if (weight > b) return
        if (i == wv2.size) {
            max2 = Math.max(max2, value)
            return
        }
        val (wi, vi) = wv2[i]
        search2(i + 1, weight + wi, value + vi)
        search2(i + 1, weight, value)
    }
    search2(0, 0, 0)

    return max + max2
}