package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.nextInt()
    val t = sc.nextInt()
    val x = sc.nextInt()
    println(problem228a(s, t, x))
}

fun problem228a(s: Int, t: Int, x: Int): String {
    if (x in s until t) return "Yes\n"
    if (s > t) {
        if (x in s..23 || x in 0 until t) return "Yes"
    }
    return "No"
}
