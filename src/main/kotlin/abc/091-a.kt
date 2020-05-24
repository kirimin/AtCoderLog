package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println(problem091a(a, b, c))
}

fun problem091a(a: Int, b: Int, c: Int): String {
    return if (a + b >= c) "Yes" else "No"
}