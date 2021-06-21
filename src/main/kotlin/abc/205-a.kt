package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem205a(a, b))
}

fun problem205a(a: Int, b: Int): Double {
    return a * (b * 0.01)
}