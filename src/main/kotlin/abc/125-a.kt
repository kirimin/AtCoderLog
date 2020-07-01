package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val t = sc.nextInt()
    println(problem125a(a, b, t))
}

fun problem125a(a: Int, b: Int, t: Int): Int {
    return b * (t / a)
}