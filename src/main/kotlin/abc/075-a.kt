package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println(problem075a(a, b, c))
}

fun problem075a(a: Int, b: Int, c: Int): Int {
    return if (a == c) b else if (a == b) c else a
}