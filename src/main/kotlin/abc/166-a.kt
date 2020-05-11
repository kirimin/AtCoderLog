package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem166a(s))
}

fun problem166a(s: String): String {
    return if (s == "ABC") "ARC" else "ABC"
}