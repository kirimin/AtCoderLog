package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem247a(s))
}

fun problem247a(s: String): String {
    return "0" + s[0] + s[1] + s[2]
}