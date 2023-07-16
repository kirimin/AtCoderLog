package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem295c(n, a))
}

fun problem295c(n: Int, a: List<Long>): Int {
    val deque = ArrayDeque<Long>()
    deque.addAll(a.sorted())
    var count = 0
    while (deque.isNotEmpty()) {
        val a = deque.pollFirst()
        val b = deque.pollFirst()
        if (b == null) break
        if (a == b) {
            count++
        } else {
            deque.addFirst(b)
        }
    }
    return count
}