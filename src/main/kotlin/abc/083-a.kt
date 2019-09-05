package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    println(problem083a(a, b, c, d))
}

fun problem083a(a: Int, b: Int, c: Int, d: Int): String {
    return when {
        a + b > c + d -> "Left"
        a + b < c + d -> "Right"
        else -> "Balanced"
    }
}