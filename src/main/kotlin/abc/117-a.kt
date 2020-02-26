package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    val x = sc.nextInt()
    println(problem117a(t, x))
}

fun problem117a(t: Int, x: Int): Double {
    return t.toDouble() / x
}