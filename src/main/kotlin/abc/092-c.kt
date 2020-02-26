package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem092c(n, a))
}

fun problem092c(n: Int, a: List<Int>): String {
    val array = IntArray(n + 1) { 0 }
    array[0] = Math.abs(a[0])
    for (i in 1 until n) {
        array[i] = Math.abs(a[i] - a[i - 1])
    }
    array[n] = Math.abs(0 - a[n - 1])

    val sum = array.sum()
    val ans = mutableListOf<Int>()
    for (i in 0 until n) {
        val 引いたやつ = sum - (array[i] + array[i + 1])
        val 代わり = Math.abs((if (i == 0) 0 else a[i - 1]) - (if (i == n - 1) 0 else a[i + 1]))
        ans.add(引いたやつ + 代わり)
    }
    return ans.joinToString("\n")
}