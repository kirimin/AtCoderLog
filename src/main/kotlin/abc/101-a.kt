package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem101a(s))
}

fun problem101a(s: String): Int {
    var ans = 0
    s.forEach { if (it == '+') ans++ else ans-- }
    return ans
}