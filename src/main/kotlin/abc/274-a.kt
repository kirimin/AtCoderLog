package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem274a(a, b))
}

fun problem274a(a: Int, b: Int): String {
    return String.format("%.3f", Math.round(b / a.toDouble() * 1000) / 1000.0)
}