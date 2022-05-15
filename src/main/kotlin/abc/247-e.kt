package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextInt()
    val y = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem247e(n, x, y, a))
}

fun problem247e(n: Int, x: Int, y: Int, a: List<Int>): Long {
    var count = 0L
//    for (l in 0 until n) {
//        for (r in l until n) {
//            val lr = a.subList(l, r + 1)
//            if (lr.min() == y && lr.max() == x) {
//                debugLog(l, r)
//                count++
//            }
//        }
//    }
    var left = 0
    for (right in n - 1 downTo 0) {
        left = 0
        while (left <= right &&
            (a.subList(left, right + 1).max() == x) &&
            (a.subList(left, right + 1).min() == y)
        ) {
            left++
        }
        debugLog(left, right)
    }
    return count
}