package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem249b(s))
}

fun problem249b(s: String): String {
    if (s.length != s.toSet().size) {
        return "No"
    }
    val small = ('a'..'z').toSet()
    val big = ('A'..'Z').toSet()
    var hasS = false
    var hasB = false
    for (c in s) {
        if (c in 'a'..'z') {
            hasS = true
        }
        if (c in 'A'..'Z') {
            hasB = true
        }
    }
    return if (hasS && hasB) "Yes" else "No"
}