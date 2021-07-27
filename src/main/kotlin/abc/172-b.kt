package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem172b(s, t))
}

fun problem172b(s: String, t: String): Int {
    var count = 0
    for (i in 0 until s.length) {
        if (s[i] != t[i]) count++
    }
    return count
}