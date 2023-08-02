package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem280c(s, t))
}

fun problem280c(s: String, t: String): Int {
    for (i in 0 until s.length) {
        if (s[i] != t[i]) {
            return i + 1
        }
    }
    return t.length
}