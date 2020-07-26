package other_contests.code_festival

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem2016a(s))
}

fun problem2016a(s: String): String {
    return s.take(4) + " " + s.takeLast(8)
}