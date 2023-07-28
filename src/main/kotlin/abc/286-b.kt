package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem286b(n, s))
}

fun problem286b(n: Int, s: String): String {
    return s.replace("na", "nya")
}