package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val d = sc.nextInt()
    val t = sc.nextInt()
    val s = sc.nextInt()
    println(problem177a(d,t,s))
}

fun problem177a(d: Int, t: Int, s: Int): String {
    return if (d.toDouble() / s <= t) "Yes" else "No"
}