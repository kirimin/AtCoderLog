package arc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem031a(s))
}

fun problem031a(s: String): String {
    return if (s == s.reversed()) "YES" else "NO"
}