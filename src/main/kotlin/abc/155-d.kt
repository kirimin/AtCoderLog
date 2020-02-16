package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem155d(n, k, a))
}

fun problem155d(n: Int, k: Int, a: List<Long>): Long {
    val seki = mutableListOf<Long>()
    for (i in 0 until a.size) {
        val ai = a[i]
        for (j in i + 1 until a.size) {
            val aj = a[j]
            seki.add(ai * aj)
        }
    }
    debugLog(seki)
    return seki.sorted()[k - 1]
}