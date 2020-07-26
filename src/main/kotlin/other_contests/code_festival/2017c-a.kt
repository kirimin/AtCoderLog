package other_contests.code_festival

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem2017a(s))
}

fun problem2017a(s: String): String {
    return if (s.contains("AC")) "Yes" else "No"
}