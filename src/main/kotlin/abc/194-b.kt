package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val ab = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    println(problem194b(n, ab))
}

fun problem194b(n: Int, ab: List<Pair<Int, Int>>): Int {
    var min = Integer.MAX_VALUE
    for (i in 0 until n) {
        for (j in 0 until n) {
            val a = ab[i].first
            val b = ab[j].second
            if (i != j) {
                min = Math.min(min, Math.max(a, b))
            } else {
                min = Math.min(min,a + b)
            }
        }
    }
    return min
}