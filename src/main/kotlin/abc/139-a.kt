package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem139a(s, t))
}

fun problem139a(s: String, t: String): Int {
    var count = 0
    for (i in 0..2) {
        if (s[i] == t[i]) count++
    }
    return count
}