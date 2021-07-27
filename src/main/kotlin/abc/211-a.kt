package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem211a(a, b))
}

fun problem211a(a: Int, b: Int): Double {
    return ((a - b) / 3.0) + b
}