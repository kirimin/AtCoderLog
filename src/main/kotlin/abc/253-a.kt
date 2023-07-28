package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println(problem253a(a, b, c))
}

fun problem253a(a: Int, b: Int, c: Int): String {
    return if (a <= b && b <= c) "Yes" else if (a >= b && b >= c) "Yes" else "No"
}