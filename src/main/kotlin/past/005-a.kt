package past

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem5a(s))
}

fun problem5a(s: String): String {
    return if (s.contains("ooo")) "o" else if (s.contains("xxx")) "x" else "draw"
}