package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem160a(s))
}

fun problem160a(s: String): String {
    return if (s[2] == s[3] && s[4] == s[5]) "Yes" else "No"
}