package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n * 3).map { sc.next().toInt() }
    println(problem306c(n, a))
}

fun problem306c(n: Int, a: List<Int>): String {
    val ans = mutableMapOf<Int, Int>()
    val count = Array<Int>(n + 1) { 0 }
    for (i in 0 until n * 3) {
        val ai = a[i]
        count[ai]++
        if (count[ai] == 2) {
            ans[ai] = i
        }
    }
    return ans.keys.joinToString(" ")
}