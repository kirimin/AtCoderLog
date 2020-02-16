package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    val a = sc.nextInt()
    val b = sc.nextInt()
    val u = sc.next()
    println(problem154a(s, t, a, b, u))
}

fun problem154a(s: String, t: String, a: Int, b: Int, u: String): String {
    return if (s == u) (a - 1).toString() + " " + b else a.toString() + " " + (b - 1)
}