package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val r = sc.nextInt()
    val g = sc.nextInt()
    println(problem076a(r, g))
}

fun problem076a(r: Int, g: Int): Int {
    return g * 2 - r
}