package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val c = sc.next().toCharArray()
    println(problem189a(c))
}

fun problem189a(c: CharArray): String {
    return if (c[0] == c[1] && c[1] == c[2]) "Won" else "Lost"
}