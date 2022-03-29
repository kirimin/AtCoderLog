package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem238b(n, a))
}

fun problem238b(n: Int, a: List<Int>): Int {
    var list = mutableListOf<Int>()
    list.add(0)
    for (i in 0 until n) {
        val ai = a[i]
        list = list.map { (it + ai) % 360 }.toMutableList()
        list.add(0)
        list = list.sorted().toMutableList()
    }
    val ans = mutableListOf<Int>()
    for (j in 1 until list.size) {
        ans.add(Math.abs(list[j - 1] - list[j]))
    }
    ans.add(360 - list.last())
    return ans.max()!!
}