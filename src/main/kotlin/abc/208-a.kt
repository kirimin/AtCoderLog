package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem208a(a, b))
}

fun problem208a(a: Int, b: Int): String {
    return if (a * 6 >= b && a <= b) "Yes" else "No"
}