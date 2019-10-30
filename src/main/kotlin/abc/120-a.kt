package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println(problem120a(a, b, c))
}

fun problem120a(a: Int, b: Int, c: Int): Int {
    return if (c * a <= b) c else b / a
}