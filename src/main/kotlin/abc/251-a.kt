package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem251a(s))
}

fun problem251a(s: String): String {
    return if (s.length == 1) {
        s + s + s + s + s + s
    } else if (s.length == 2) {
        s + s + s
    } else {
        s + s
    }
}