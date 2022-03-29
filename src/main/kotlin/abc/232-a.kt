package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem232a(s))
}

fun problem232a(s: String): Int {
    return s[0].toString().toInt() * s[2].toString().toInt()
}
