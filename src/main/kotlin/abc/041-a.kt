package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val i = sc.nextInt()
    println(problem041a(s, i))
}

fun problem041a(s: String, i: Int): String {
    return s[i - 1].toString()
}