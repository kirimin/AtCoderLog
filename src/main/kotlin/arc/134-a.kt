package arc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val l = sc.nextLong()
    val w = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem134a(n, l, w, a))
}

fun problem134a(n: Int, l: Long, w: Long, a: List<Long>): Long {
    var right = 0L
    var left = 0L
    var count = 0L
    for (i in 0 until n) {
        val ai = a[i]
        left = ai
        if (right < left) {
            val diff = left - right
            val need = diff / w + if (diff % w != 0L) 1 else 0
            right += w * need
            right = Math.max(right, left + w)
            count += need
        } else {
            right = Math.max(right, left + w)
        }
    }
    left = l
    if (right < left) {
        val diff = left - right
        val need = diff / w + if (diff % w != 0L) 1 else 0
        right += w * need
        right = Math.max(right, left + w)
        count += need
    }
    return count
}