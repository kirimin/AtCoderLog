package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem081a(s))
}

fun problem081a(s: String): Int {
    var count = 0
    if (s[0] == '1') count++
    if (s[1] == '1') count++
    if (s[2] == '1') count++
    return count
}