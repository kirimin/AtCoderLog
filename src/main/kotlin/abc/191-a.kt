package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val v = sc.nextInt()
    val t = sc.nextInt()
    val s = sc.nextInt()
    val d = sc.nextInt()
    println(problem191a(v, t, s, d))
}

fun problem191a(v: Int, t: Int, s: Int, d: Int): String {
    val startS = v * t
    val endS = v * s
    return if (d !in (startS..endS)) "Yes" else "No"
}