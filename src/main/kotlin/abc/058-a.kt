package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    val c = sc.nextLong()
    println(problem058a(a, b, c))
}

fun problem058a(a: Long, b: Long, c: Long): String {
    return if (b - a == c - b) "YES" else "NO"
}