package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val l = sc.nextInt()
    val t = sc.nextLong()
    val x = sc.nextInt()
    val ab = (0 until n).map { sc.next().toLong() to sc.next().toLong() }
    println(problem007f(n, l, t, x, ab))
}

fun problem007f(n: Int, l: Int, t: Long, x: Int, ab: List<Pair<Long, Long>>): String {
    // l,t = 負荷限界
    // x = 停止時間
    var currentTime = 0L
    var currentT = 0L
    for (i in 0 until n) {
        val (a, b) = ab[i]
        if (b < l) {
            currentTime += a
            currentT = 0
            continue
        }
        if (a > t) return "forever"
        if (currentT + a == t) {
            currentTime += x
            currentTime += a
            currentT = 0
            continue
        }
        if (currentT + a >= t) {
            currentTime += t - currentT
            currentTime += x
            currentT = a
            currentTime += a
            if (a == t) {
                currentTime += x
                currentT = 0
            }
            continue
        }
        currentT += a
        currentTime += a
    }
    return currentTime.toString()
}