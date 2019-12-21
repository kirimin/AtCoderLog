package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val q = sc.nextInt()
    val s = sc.next()
    val lr = (0 until q).map { sc.next().toInt() to sc.next().toInt() }
    println(problem122c(n, q, s, lr))
}

fun problem122c(
    n: Int,
    q: Int,
    s: String,
    lr: List<Pair<Int, Int>>
): String {
    val cs = IntArray(n + 1) { 0 }
    for (i in 0 until n) {
        cs[i + 1] = if (i < n - 1 && s[i] == 'A' && s[i + 1] == 'C') cs[i] + 1 else cs[i]
    }
    val ans = mutableListOf<Int>()
    for (i in 0 until q) {
        val (l, r) = lr[i]
        ans.add(cs[r - 1] - cs[l - 1])
    }
    return ans.joinToString("\n")
}