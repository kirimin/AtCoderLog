package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    println(problem196a(a, b, c, d))
}

fun problem196a(a: Int, b: Int, c: Int, d: Int): Int {
    return b - c
}