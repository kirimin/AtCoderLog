package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem249d(n, a))
}

fun problem249d(n: Int, a: List<Int>): Long {
    val a = a.sortedDescending()
//    debugLog(a)
    var count = 0L
//    for (i in 0 until n) {
//        for (j in 0 until n) {
//            for (k in 0 until n) {
//                if (a[i] / a[j] == a[k] && a[i] % a[j] == 0) {
//                    count++
//                    debugLog(a[i], a[j], a[k])
//                }
//            }
//        }
//    }
    val map = a.groupBy { it }
//    debugLog(map)
    for (i in 0 until n) {
        val ai = a[i]
        for (j in i until n) {
            val aj = a[j]
            if (ai % aj == 0) {
                if (map[ai / aj] == null) continue
//                debugLog(ai, aj, ai / aj)
                count += map[ai / aj]!!.size
            }
        }
    }
    return count
}