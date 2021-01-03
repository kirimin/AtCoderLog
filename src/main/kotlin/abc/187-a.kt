package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.next()
    val b = sc.next()
    println(problem187a(a, b))
}

fun problem187a(a: String, b: String): Int {
    return Math.max(a.map { it.toString().toInt() }.sum(), b.map { it.toString().toInt() }.sum())
}