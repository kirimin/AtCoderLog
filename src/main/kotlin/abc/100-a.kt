package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem100a(a, b))
}

fun problem100a(a: Int, b: Int): String {
    return if (a > 8 || b > 8) ":(" else "Yay!"
}