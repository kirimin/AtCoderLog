package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    println(problem097a(a, b, c, d))
}

fun problem097a(a: Int, b: Int, c: Int, d: Int): String {
    return if((Math.abs(a - b) <= d && Math.abs(b - c) <= d) || Math.abs(a - c) <= d) "Yes" else "No"
}