package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem143a(a, b))
}

fun problem143a(a: Int, b: Int): Int {
    val ans = a - b * 2
    return if (ans < 0) 0 else ans
}