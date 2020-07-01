package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.next()
    val b = sc.next()
    println(problem169c(a, b))
}

fun problem169c(a: String, b: String): Long {
    return a.toLong() * (b.replace(".", "").toLong()) / 100
}