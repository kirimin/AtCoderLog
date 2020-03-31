package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem109a(a, b))
}

fun problem109a(a: Int, b: Int): String {
    return if (a * b % 2 != 0) "Yes" else "No"
}