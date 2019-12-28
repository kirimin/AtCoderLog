package arc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem022b(n, a))
}

fun problem022b(n: Int, a: List<Int>): Int {
    var res = 0
    var right = 0
    val set = mutableSetOf<Int>()
    for (left in 0 until n) {
        while (right < n && !set.contains(a[right])) {
            set.add(a[right])
            right++
        }
        res = Math.max(res, set.size)
        set.remove(a[left])
        if (left == right) right++
    }
    return res
}