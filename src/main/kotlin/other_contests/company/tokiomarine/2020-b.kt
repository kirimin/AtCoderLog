package other_contests.company.tokiomarine

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val v = sc.nextLong()
    val b = sc.nextLong()
    val w = sc.nextLong()
    val t = sc.nextLong()
    println(problem2020b(a, v, b, w, t))
}

fun problem2020b(A: Long, V: Long, B: Long, W: Long, t: Long): String {
    var a = A
    var b = B
    var v = V
    var w = W
    if (a < 0 && b >= 0) {
        b = b + Math.abs(a)
        a = 0
    } else if (b < 0 && a >= 0) {
        a = a + Math.abs(b)
        b = 0
    } else if (a < 0 && b < 0) {
        a += Math.pow(10.0, 9.0).toLong()
        b += Math.pow(10.0, 9.0).toLong()
    }
    if (a < b) {
        if (v - w <= 0) {
            return "NO"
        }
        val speed = v - w
        val diff = b - a
        return if (speed * t >= diff) "YES" else "NO"
    } else {
        if (v - w <= 0) return "NO"
        val speed = v - w
        val diff = a - b
        return if (speed * t >= diff)  "YES" else "NO"
    }
}