package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val st = (0 until n).map { sc.next() to sc.next() }
    println(problem247b(n, st))
}

fun problem247b(n: Int, st: List<Pair<String, String>>): String {
    val count1 = (st.map { it.first }).groupBy { it }
    val count2 = st.map { it.second }.groupBy { it }
    for (i in 0 until n) {
        val (si, ti) = st[i]
        if (si == ti) {
            if (!((count1[si]!!.count() == 1 && (count2[si]!!.count() ?: 0) == 1) ||
                        (count2[ti]!!.count() == 1 && (count1[ti]!!.count() ?: 0) == 1))
            ) {
                return "No"
            }
        } else {
            if (!((count1[si]!!.count() == 1 && (count2[si]?.count() ?: 0) == 0) ||
                        (count2[ti]!!.count() == 1 && (count1[ti]?.count() ?: 0) == 0))
            ) {
                return "No"
            }
        }
    }
    return "Yes"
}