package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val st = (0 until n).map { sc.next() to sc.next().toLong() }
    println(problem251c(n, st))
}

fun problem251c(n: Int, st: List<Pair<String, Long>>): Int {
    val set = mutableSetOf<String>()
    var max = 0L
    var maxI = 0
    for (i in 0 until n) {
        val (s, t) = st[i]
        if (set.contains(s)) {
            continue
        }
        set.add(s)
        if (max < t) {
            max = t
            maxI = i + 1
        }
    }
    return maxI
}