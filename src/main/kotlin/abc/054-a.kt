package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.next().toInt()
    val b = sc.next().toInt()
    println(problem54a(a, b))
}

fun problem54a(a: Int, b: Int): String {
    val a2 = if (a == 1) 14 else a
    val b2 = if (b == 1) 14 else b
    return when {
        a2 > b2 -> "Alice"
        b2 > a2 -> "Bob"
        else -> "Draw"
    }
}