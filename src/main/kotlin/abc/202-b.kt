package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem202b(s))
}

fun problem202b(s: String): String {
    val len = s.length
    var s = s
    s = s.reversed()
    s = s.replace("6", "2")
    s = s.replace("9", "6")
    s = s.replace("2", "9")
    return s
}