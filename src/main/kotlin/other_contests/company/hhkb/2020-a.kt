package other_contests.company.hhkb

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem2020a(s, t))
}

fun problem2020a(s: String, t: String): String {
    return if (s == "Y") t.toUpperCase() else t
}