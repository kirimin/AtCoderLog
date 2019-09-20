package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem124b(a, b))
}

fun problem124b(a: Int, b: Int): Int {
    return if (a == b) a + b else Math.max(a, b) * 2 - 1
}