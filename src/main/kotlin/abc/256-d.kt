package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val lr = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    println(problem256d(n, lr))
}

fun problem256d(n: Int, lr: List<Pair<Int, Int>>): String {
    val lr = lr.sortedBy { it.first }
    val ans = mutableListOf<Pair<Int, Int>>()
    var prevR = lr[0].first
    var prevL = lr[0].first
    for (i in 0 until n) {
        val (l, r) = lr[i]
        if (prevR < l) {
            ans.add(prevL to prevR)
            prevR = r
            prevL = l
        } else {
            prevR = Math.max(prevR, r)
        }
    }
    ans.add(prevL to prevR)
    return ans.map { "${it.first} ${it.second}" }.joinToString("\n")
}