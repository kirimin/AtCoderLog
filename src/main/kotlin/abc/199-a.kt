package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    val c = sc.nextLong()
    println(problem199a(a, b, c))
}

fun problem199a(a: Long, b: Long, c: Long): String {
    return if (a * a + b * b < c * c) "Yes" else "No"
}