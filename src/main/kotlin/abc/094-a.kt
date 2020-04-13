package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val x = sc.nextInt()
    println(problem094a(a, b, x))
}

fun problem094a(a: Int, b: Int, x: Int): String {
    return if (a > x || a + b < x) "NO" else "YES"
}