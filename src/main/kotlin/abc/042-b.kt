package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val l = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem042b(n, l, s))
}

fun problem042b(n: Int, l: Int, s: List<String>): String {
    return s.sorted().joinToString("")
}