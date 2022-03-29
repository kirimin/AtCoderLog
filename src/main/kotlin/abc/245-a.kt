package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    println(problem245a(a, b, c, d))
}

fun problem245a(a: Int, b: Int, c: Int, d: Int): String {
    return if (a * 60 + b < c * 60 + d + 1) "Takahashi" else "Aoki"
}