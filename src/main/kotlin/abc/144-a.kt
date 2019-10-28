package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem144a(a, b))
}

fun problem144a(a: Int, b: Int): Int {
    return if (a >= 10 || b >= 10) -1 else a * b
}