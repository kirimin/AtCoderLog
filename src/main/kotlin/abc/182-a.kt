package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem182a(a, b))
}

fun problem182a(a: Int, b: Int): Int {
    return Math.max(((2 * a) + 100) - b, 0)
}