package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem141d(n, m, a))
}

fun problem141d(n: Int, m: Int, a: List<Long>): Long {
    val queue: Queue<Long> = PriorityQueue<Long>(n) { i1: Long, i2: Long ->
        return@PriorityQueue if (i2 > i1) 1 else -1
    }
    for (i in 0 until n) {
        queue.add(a[i])
    }
    for (i in 0 until m) {
        queue.add(queue.poll() / 2)
    }
    return queue.sum()
}