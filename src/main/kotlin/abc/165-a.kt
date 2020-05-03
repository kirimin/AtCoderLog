package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val k = sc.nextInt()
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem165a(k, a, b))
}

fun problem165a(k: Int, a: Int, b: Int): String {
    for (i in a..b) {
        if (i % k == 0) return "OK"
    }
    return "NG"
}