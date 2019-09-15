package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem082a(a, b))
}

fun problem082a(a: Int, b: Int): Int {
    return (((a + b).toDouble() / 2) + 0.9).toInt()
}