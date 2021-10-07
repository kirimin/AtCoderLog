package past

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem008i(n, a))
}

fun problem008i(n: Int, a: List<Long>): Long {
    val a = a.toLongArray()
    var count = 0
    for (i in 0 until n) {
        var ai = a[i]
        if (ai % 2 == 0L) {
            while (ai % 2 == 0L) {
                ai /= 2
                count++
            }
            a[i] = ai
        }
    }
    // 宣言
    val pq = PriorityQueue<Long> { x: Long, y: Long ->
        x.compareTo(y)
    }
    pq.addAll(a.toList())
    for (i in 0 until count) {
        val min = pq.poll()
        pq.add(min * 3)
    }

    return pq.poll()
}