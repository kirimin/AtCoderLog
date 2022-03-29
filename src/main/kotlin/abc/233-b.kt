package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val l = sc.nextInt()
    val r = sc.nextInt()
    val s = sc.next()
    println(problem233b(l, r, s))
}

fun problem233b(l: Int, r: Int, s: String): String {
    return s.take(l - 1) + s.drop(l - 1).dropLast(s.length - r).reversed() + s.takeLast(s.length - r)
}