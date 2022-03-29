package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    val w = sc.nextInt()
    val a = (0 until h).map { (0 until w).map { sc.next().toLong() }  }
    println(problem237b(h, w, a))
}

fun problem237b(h: Int, w: Int, a: List<List<Long>>): String {
    val ans = Array(w) { LongArray(h) }
    for (i in 0 until w) {
        for (j in 0 until h) {
            ans[i][j] = a[j][i]
        }
    }
    return ans.map { it.joinToString(" ") }.joinToString("\n")
}