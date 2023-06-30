package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    val w = (0 until n).map { sc.next().toLong() }
    println(problem257c(n, s, w))
}

fun problem257c(n: Int, s: String, w: List<Long>): Int {
    val list = mutableListOf<Pair<Char, Long>>()
    for (i in 0 until n) {
        list.add(s[i] to w[i])
    }
    val list2 = list.sortedBy { it.second }
    val adult = list2.count { it.first == '1' }
    var aCount = 0
    var cCount = 0
    var max = adult
    var prev = 0L
    for (i in 0 until n) {
        val (si, wi) = list2[i]
        if (prev != wi) {
            val tmp = (adult + cCount) - aCount
            max = Math.max(max, tmp)
        }
        if (si == '0') {
            cCount++
        } else {
            aCount++
        }
        prev = wi
    }
    val tmp = (adult + cCount) - aCount
    max = Math.max(max, tmp)
    return max
}