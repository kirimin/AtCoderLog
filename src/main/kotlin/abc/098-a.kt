package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem098a(a, b))
}

fun problem098a(a: Int, b: Int): Int {
    return listOf(a + b, a - b, a * b).max()!!
}