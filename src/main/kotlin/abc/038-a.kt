package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem038a(s))
}

fun problem038a(s: String): String {
    return if (s.last() == 'T') "YES" else "NO"
}