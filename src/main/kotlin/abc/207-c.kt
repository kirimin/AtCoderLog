package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val tlr = (0 until n).map { Triple(sc.next().toInt(), sc.next().toLong(), sc.next().toLong()) }
    println(problem297c(n, tlr))
}

fun problem297c(n: Int, tlr: List<Triple<Int, Long, Long>>): Int {
    var count = 0
    for (i in 0 until n) {
        val (t, l, r) = tlr[i]
        var left = 0.0
        var right = 0.0
        if (t == 1) {
            left = l.toDouble()
            right = r.toDouble()
        } else if (t == 2) {
            left = l.toDouble()
            right = r - 0.5
        } else if (t == 3) {
            left = l + 0.5
            right = r.toDouble()
        } else if (t == 4) {
            left = l + 0.5
            right = r - 0.5
        }
        for (j in i + 1 until n) {
            val (t, l, r) = tlr[j]
            var left2 = 0.0
            var right2 = 0.0
            if (t == 1) {
                left2 = l.toDouble()
                right2 = r.toDouble()
            } else if (t == 2) {
                left2 = l.toDouble()
                right2 = r - 0.5
            } else if (t == 3) {
                right2 = r.toDouble()
                left2 = l + 0.5
            } else if (t == 4) {
                left2 = l + 0.5
                right2 = r - 0.5
            }
            if (Math.max(left, left2) <= Math.min(right, right2)) {
                count++
            }
        }
    }
    return count
}