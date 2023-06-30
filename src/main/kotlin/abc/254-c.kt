package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem254c(n, k, a))
}

fun problem254c(n: Int, k: Int, a: List<Long>): String {
    val list = mutableListOf<MutableList<Long>>()
    for (i in 0 until k) {
        list.add(mutableListOf())
        for (j in i until n step k) {
            list[i].add(a[j])

        }
    }
    val sorted = list.map { it.sorted() }
//    debugLog(sorted)
    var prev = 0L
    for (i in 0 until n) {
        for (j in 0 until sorted.size) {
            try {
//                debugLog(prev, sorted[j][i])
                if (prev > sorted[j][i]) return "No"
                prev = sorted[j][i]
            } catch (e: Exception) {
                break
            }
        }
    }
    return "Yes"
}