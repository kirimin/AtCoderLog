package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val s = sc.next()
    println(problem126a(n, k, s))
}

fun problem126a(n: Int, k: Int, s: String): String {
    return s.mapIndexed { index, c -> if (index == k - 1) c.toLowerCase() else c }.joinToString("")
}