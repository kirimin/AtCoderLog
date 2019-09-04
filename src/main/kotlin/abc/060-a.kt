package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.next()
    val b = sc.next()
    val c = sc.next()
    println(problem060a(a, b, c))
}

fun problem060a(a: String, b: String, c: String): String {
    return if (a.takeLast(1) == b.take(1) &&
        b.takeLast(1) == c.take(1)
    ) "YES" else "NO"
}