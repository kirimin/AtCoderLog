package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem164c(n, s))
}

fun problem164c(n: Int, s: List<String>): Int {
    val set = mutableSetOf<String>()
    return s.toSet().size
}