package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val m = sc.nextInt()
    val a = (0 until m).map { sc.next().toLong() }
    println(problem185d(n, m, a))
}

fun problem185d(n: Long, m: Int, a: List<Long>): Long {
    val a = a.sorted()
    var minSpace = n
    var prev = 1L
    var notfound = true
    if (m == 0) return 1
    for (i in 0 until m) {
        val ai = a[i]
        if (ai - prev != 0L) {
            notfound = false
            minSpace = Math.min(minSpace, ai - prev)
        }
        prev = ai + 1
    }
    if (notfound) return 0L
    var ans = 0L
    var start = 1L
    for (i in 0 until m) {
        val ai = a[i]
        val space = ai - start
        ans += space / minSpace + if (space % minSpace != 0L) 1 else 0
        start = ai + 1
    }
    val space = n - (start - 1)
    ans += space / minSpace + if (space % minSpace != 0L) 1 else 0
    return ans
}

// □■□□□
// ■□■□□
// □□■□□□□□■□□□■