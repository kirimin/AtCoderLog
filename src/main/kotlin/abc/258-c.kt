package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val q = sc.nextInt()
    val s = sc.next()
    val query = (0 until q).map { sc.next().toInt() to sc.next().toInt() }
    println(problem258c(n, q, s, query))
}

fun problem258c(n: Int, q: Int, s: String, query: List<Pair<Int, Int>>): String {
    var p = 0
    val ans = mutableListOf<Char>()
    for (i in 0 until q) {
        val (a, x) = query[i]
        when (a) {
            1 -> {
                p = (p - x + n) % n
            }
            2 -> {
                val tmp = s[(p + x - 1) % n]
                ans.add(tmp)
            }
        }
    }
    return ans.joinToString("\n")
}