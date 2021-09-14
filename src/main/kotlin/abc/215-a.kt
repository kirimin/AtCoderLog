package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem215a(s))
}

fun problem215a(s: String): String {
    return if (s == "Hello,World!") "AC" else "WA"
}