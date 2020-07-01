package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println(problem042a(a, b, c))
}

fun problem042a(a: Int, b: Int, c: Int): String {
    return if (listOf(a, b, c).count { it == 5 } == 2 && listOf(a, b, c).count { it == 7 } == 1) "YES" else "NO"
}