package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val k = sc.nextInt()
    val s = sc.next()
    println(problem168b(k, s))
}

fun problem168b(k: Int, s: String): String {
    if (s.length <= k) return s
    return s.take(k) + "..."
}