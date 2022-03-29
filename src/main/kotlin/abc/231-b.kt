package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem231b(n, s))
}

fun problem231b(n: Int, s: List<String>): String {
    return s.groupBy { it }.maxBy { it.value.count() }!!.key
}