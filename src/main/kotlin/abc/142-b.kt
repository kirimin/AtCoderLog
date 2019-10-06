package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val h = (0 until n).map { sc.next().toInt() }
    println(problem142b(n, k, h))
}

fun problem142b(n: Int, k: Int, h: List<Int>): Int {
    var count = 0
    for (i in 0 until n) {
        if (h[i] >= k) count++
    }
    return count
}