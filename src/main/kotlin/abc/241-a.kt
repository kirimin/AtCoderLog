package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = (0 until 10).map { sc.next().toInt() }
    println(problem241a(a))
}

fun problem241a(a: List<Int>): Int {
    var current = a[0]
    current = a[current]
    current = a[current]
    return current
}