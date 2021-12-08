package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val j = (0 until n).map { sc.next().toInt() + sc.next().toInt() + sc.next().toInt() }
    println(problem228c(n, k, j))
}

fun problem228c(n: Int, k: Int, j: List<Int>): String {
    val rank = j.mapIndexed { index, i -> i to index }.sortedByDescending { it.first }
    val ans = mutableListOf<String>()
    val kScore = rank[k - 1].first
    for (i in 0 until n) {
        if (j[i] + 300 >= kScore) ans.add("Yes") else ans.add("No")
    }
    return ans.joinToString("\n")
}