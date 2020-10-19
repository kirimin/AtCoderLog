package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem180a(n, a, b))
}

fun problem180a(n: Int, a: Int, b: Int): Int {
    return n - a + b
}