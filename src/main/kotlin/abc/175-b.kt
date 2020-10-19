package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val l = (0 until n).map { sc.next().toLong() }
    println(problem175b(n, l))
}

fun problem175b(n: Int, l: List<Long>): Long {
    var count = 0L
    for (i in 0 until n) {
        val a = l[i]
        for (j in i + 1 until n) {
            val b = l[j]
            if (a == b) continue
            for (k in j + 1 until n) {
                val c = l[k]
                if (b == c || a == c) continue
                if (a + b > c && b + c > a && c + a > b) count++
            }
        }
    }
    return count
}