package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem182d(n, a))
}

fun problem182d(n: Int, a: List<Long>): Long {
    var ans = 0L
    var max = 0L
    var sum = 0L
    var current = 0L
    for (i in 0 until n) {
        val ai = a[i]
        max = Math.max(max, sum + ai)
        ans = Math.max(ans, current + max)
        current += sum + ai
        sum += ai
    }
    return ans
}

//       -2    +1    +3    -1    -1
// +0 -> -2
// -2 -> -4 -> -3
// -3 -> -5 -> -4 -> -1
// -1 -> -3 -> -2 -> +1 -> +0
// +0 -> -2 -> -1 -> +2 -> +1 -> +0

// -3 + 1 + 3