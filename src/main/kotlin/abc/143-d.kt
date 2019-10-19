package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val l = (0 until n).map { sc.next().toInt() }
    println(problem143d(n, l))
}

fun problem143d(n: Int, l: List<Int>): Int {
    val l = l.sorted().toIntArray()
    var count = 0
    for (i in 0 until n) {
        val a = l[i]
        for (j in i + 1 until n) {
            val b = l[j]
            for (k in j + 1 until n) {
                val c = l[k]
                if (a < b + c && b < c + a && c < a + b) {
                    count++
                } else {
                    break
                }
            }
        }
    }
    return count
}