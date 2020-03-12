package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem118a(a, b))
}

fun problem118a(a: Int, b: Int): Int {
    return if (b % a == 0) a + b else b - a
}