package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem162d(n, s))
}

fun problem162d(n: Int, s: String): Long {

    val rs = IntArray(n + 1) { 0 }
    for (i in 0 until n) {
        rs[i + 1] = rs[i] + if (s[i] == 'R') 1 else 0
    }
    val gs = IntArray(n + 1) { 0 }
    for (i in 0 until n) {
        gs[i + 1] = gs[i] + if (s[i] == 'G') 1 else 0
    }
    val bs = IntArray(n + 1) { 0 }
    for (i in 0 until n) {
        bs[i + 1] = bs[i] + if (s[i] == 'B') 1 else 0
    }
    val all = rs.last() * gs.last() * bs.last().toLong()
    var sub = 0L;
    for (i in 0 until n) {
        for (j in i + 1 until n) {
//            if (s[i] == s[j]) continue
            val k = j + (j - i)
            debugLog("i:${i+1}", "j:${j+1}", "k${k+1}")
            if (k >= n || s[k] == s[i] || s[k] == s[j]) continue
            sub++
        }
    }

    return all - sub
}