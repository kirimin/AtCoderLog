package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val t = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem281c(n, t, a))
}

fun problem281c(n: Int, t: Long, a: List<Long>): String {
    var current = 0L
    var playing = 0
    val ans: Pair<Int, Long>
    if (t > a.sum()) {
        val count = t / a.sum()
        current = count * a.sum()
    }
    while (true) {
        if (playing == n) playing = 0
        val ai = a[playing]
        current += ai
        if (current >= t) {
            ans = playing + 1 to Math.abs(current - (t + ai))
            break
        }
        playing++
    }
    return ans.first.toString() + " " + ans.second
}