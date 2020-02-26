package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val x = (0 until m).map { sc.next().toInt() }
    println(problem117c(n, m, x))
}

fun problem117c(n: Int, m: Int, x: List<Int>): Int {
    val x = x.sorted()
    val diffs = IntArray(m - 1)
    for (i in 1 until m) {
        diffs[i - 1] = Math.abs(x[i - 1] - x[i])
    }
    return diffs.sorted().dropLast(n - 1).sum()
}