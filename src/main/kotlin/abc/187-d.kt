package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val ab = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    println(problem187d(n, ab))
}

fun problem187d(n: Int, ab: List<Pair<Long, Long>>): Int {
    var takahashi = 0L
    var aoki = 0L
    for (i in 0 until n) {
        val abi = ab[i]
        aoki += abi.first
    }
    val need = aoki - takahashi
    if (need <= 0) return 1
    val votes = ab.map { pair ->  pair.first * 2 + pair.second }.sortedDescending()
    var sum = 0L
    var count = 0
    for (i in 0 until n) {
        val vote = votes[i]
        count++
        sum += vote
        if (sum > need) return count
    }
    return 0
}

// 2 1
// 2 1
// 2 1
// 2 1
// 2 1
// 10, 0

// 8, 3
// 6, 6
// 4, 3