package arc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val r = (0 until n).map { sc.next().toInt() }
    val c = (0 until n).map { sc.next().toInt() }
    val q = sc.nextInt()
    val rc = (0 until q).map { sc.next().toInt() to sc.next().toInt() }
    println(problem132a(n, r, c, q, rc))
}

fun problem132a(n: Int, r: List<Int>, c: List<Int>, q: Int, rc: List<Pair<Int, Int>>): String {
    val ans = CharArray(q) { '.' }
    for (i in 0 until q) {
        val (y, x) = rc[i]
        ans[i] = if (n - (r[y - 1] + c[x - 1]) < 0) '#' else '.'
    }
    return ans.joinToString("")
}