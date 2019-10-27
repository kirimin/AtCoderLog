package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val c = (0 until 3).map { sc.next() }
    println(problem090a(c))
}

fun problem090a(c: List<String>): String {
    return c[0][0].toString() + c[1][1] + c[2][2]
}