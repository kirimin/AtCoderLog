package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    println(problem067a(a, b))
}

fun problem067a(a: Int, b: Int): String {
    return if (a % 3 == 0 || b % 3 == 0 || (a + b) % 3 == 0) "Possible" else "Impossible"
}