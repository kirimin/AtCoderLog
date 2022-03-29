package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val v = sc.nextInt()
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println(problem243a(v, a, b, c))
}

fun problem243a(v: Int, a: Int, b: Int, c: Int): String {
    var v = v
    var current = 2
    val list = listOf(a, b, c)
    while (v >= 0) {
        current++
        if (current == 3) current = 0
        v -= list[current]
    }
    return when (current) {
        0 -> "F"
        1 -> "M"
        2 -> "T"
        else -> ""
    }
}