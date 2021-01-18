package other_contests.company.keyence

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    val b = (0 until n).map { sc.next().toLong() }
    println(problem2021a(n, a, b))
}

fun problem2021a(n: Int, a: List<Long>, b: List<Long>): String {
    val aMaxDP = LongArray(n) { 0 }
    aMaxDP[0] = a[0]
    for (i in 1 until n) {
        aMaxDP[i] = Math.max(aMaxDP[i - 1], a[i])
    }
    var bMax = 0L
    var max = 0L
    val ans = mutableListOf<Long>()
    for (i in 0 until n) {
        val aMax = aMaxDP[i]
        max = Math.max(max, b[i] * aMaxDP[i])
        ans.add(max)
    }
    return ans.joinToString("\n")
}

// 1:3 => 3
// 4:3,4:2 => 12