package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val x = sc.nextInt()
    val ca = (0 until n).map {
        sc.next().toInt() to (0 until m).map { sc.next().toInt() }
    }
    println(problem167c(n, m, x, ca))
}

fun problem167c(
    n: Int,
    m: Int,
    x: Int,
    ca: List<Pair<Int, List<Int>>>
): Int {
    val list = mutableListOf<Int>()
    fun select(current: Int, amount: Int, score: IntArray) {
        if (current >= n) {
            if (score.all { it >= x }) {
                list.add(amount)
            }
            return
        }
        select(current + 1, amount, score.copyOf())
        for (i in 0 until m) {
            score[i] += ca[current].second[i]
        }
        select(current + 1, amount + ca[current].first, score.copyOf())
    }
    select(0, 0, IntArray(m))
    return list.min() ?: -1
}