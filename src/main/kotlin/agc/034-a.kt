package agc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    val s = sc.next()
    println(problem034a(n, a, b, c, d, s))
}

fun problem034a(n: Int, a: Int, b: Int, c: Int, d: Int, s: String): String {
    val canSunuke = (!"#{2,}?".toRegex().containsMatchIn(s.take(c).drop(a)))
    val canFunuke = (!"#{2,}?".toRegex().containsMatchIn(s.take(d).drop(b)))
    val canReplace = if (c > d) {
        val sub = s.take(d + 1).drop(b - 2)
        ("x{3,}?".toRegex().containsMatchIn(sub.replace(".", "x")))
    } else {
        true
    }
    return if (canFunuke && canSunuke && canReplace) "Yes" else "No"
}