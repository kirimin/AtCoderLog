package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val x = sc.nextInt()
    val t = sc.nextInt()
    val d = sc.nextInt()
    println(problem259a(n, m, x, t, d))
}

fun problem259a(n: Int, m: Int, x: Int, t: Int, d: Int): Int {
    if (x - m < 0) {
        return t
    } else {
        return t - (x - m) * d
    }
}