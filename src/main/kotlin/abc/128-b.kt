package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val sp = (0 until n).map { Triple(it + 1, sc.next(), sc.next().toInt()) }
    println(problem128b(n, sp))
}

fun problem128b(n: Int, sp: List<Triple<Int, String, Int>>): String {
    return sp.sortedByDescending { it.third }.sortedBy { it.second }.map { it.first }.joinToString("\n")
}