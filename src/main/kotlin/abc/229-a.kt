package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s1 = sc.next()
    val s2 = sc.next()
    println(problem229a(s1, s2))
}

fun problem229a(s1: String, s2: String): String {
    return if ((s1[0] == '.' && s2[1] == '.') || (s1[1] == '.' && s2[0] == '.')) "No" else "Yes"
}