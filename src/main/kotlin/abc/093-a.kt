package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem093a(s))
}

fun problem093a(s: String): String {
    return if (s.count { it == 'a' } == 1 && s.count { it == 'b' } == 1 && s.count { it == 'c' } == 1) {
        "Yes"
    } else {
        "No"
    }
}