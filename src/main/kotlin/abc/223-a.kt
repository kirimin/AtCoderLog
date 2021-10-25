package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    println(problem223a(x))
}

fun problem223a(x: Int): String {
    if (x == 0) return "No"
    return if (x % 100 == 0) "Yes" else "No"
}