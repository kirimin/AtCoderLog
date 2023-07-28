package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val x = (0 until m).map {
        val k = sc.next().toInt()
        (0 until k).map { sc.next().toInt() }
    }
    println(problem272b(n, m, x))
}

fun problem272b(n: Int, m: Int, x: List<List<Int>>): String {
    val sum = (1..n).sum()
    for (i in 0 until n) {
        val i = i + 1
        val set = mutableSetOf<Int>()
        set.add(i)
        for (j in 0 until m) {
            val xj = x[j]
            if (!xj.contains(i)) continue
            set.addAll(xj)
        }
        if (set.sum() != sum) return "No"
    }
    return "Yes"
}
