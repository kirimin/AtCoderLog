package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextInt()
    val ab = (0 until n).map { sc.next().toLong() to sc.next().toLong()  }
    println(problem258d(n, x, ab))
}

fun problem258d(n: Int, x: Int, ab: List<Pair<Long, Long>>): Long {
    var min = Long.MAX_VALUE
    var time = 0L
    var count = 0
    for (i in 0 until n) {
        if (i + 1 > x) {
            break
        }
        val (a, b) = ab[i]
        time += a + b
        count++
        val tmp = time +  b * (x - count)
        min = Math.min(min, tmp)
    }
    return min
}