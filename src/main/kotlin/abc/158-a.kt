package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem158a(s))
}

fun problem158a(s: String): String {
    return if (s == "AAA" || s == "BBB") "No" else "Yes"
}