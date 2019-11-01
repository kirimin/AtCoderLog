package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem106a(a, b))
}

fun problem106a(a: Int, b: Int): Int {
    return (a - 1) * (b - 1)
}