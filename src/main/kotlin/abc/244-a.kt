package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem244a(n, s))
}

fun problem244a(n: Int, s: String): Char {
    return s.last()
}