package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem038c(n, a))
}

fun problem038c(n: Int, a: List<Int>): Long {
    var right = 1
    var res = 0L
    for (left in 0 until n) {
        while (right < n && (right <= left || a[right - 1] < a[right])) {
            right++
        }
//        debugLog(left, right, res)
        res += right - left
        if (right == left) right++
    }
    return res
}