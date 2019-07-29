package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next().toLong()
    val aList = (0..n).map { sc.next().toLong() }
    val bList = (0 until n).map { sc.next().toLong() }
    println(problem135c(aList, bList).toString())
}

fun problem135c(aList: List<Long>, bList: List<Long>): Long {
    var count = 0L
    var takeOver = 0L
    bList.forEachIndexed { i, h ->
        var hero = h
        var m1 = aList[i] - takeOver
        if (m1 <= hero) {
            hero -= m1
            count += m1
        } else {
            m1 -= hero
            count += hero
            takeOver = 0L
            return@forEachIndexed
        }

        if (hero > 0L) {
            val m2 = aList[i + 1]
            if (m2 <= hero) {
                count += m2
                takeOver = m2
            } else {
                count += hero
                takeOver = hero
            }
            return@forEachIndexed
        }
        takeOver = 0L
    }
    return count
}