package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem057a(a, b))
}

fun problem057a(a: Int, b: Int): Int {
    val ans = a + b
    return if (ans < 24) ans else ans - 24
}