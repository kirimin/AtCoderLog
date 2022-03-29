package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val pv = (0 until n).map { sc.next() to sc.next()  }
    println(problem009c(n, pv))
}

fun problem009c(n: Int, pv: List<Pair<String, String>>): String {
    val ans = mutableMapOf<String, Int>()
    for (i in 0 until n) {
        val (p, v) = pv[i]
        if (v == "WA") continue
        if (ans[p] != null) continue
        ans[p] = i + 1
    }
    return ans.toList().sortedBy { it.first }.map { it.second }.joinToString("\n")
}
