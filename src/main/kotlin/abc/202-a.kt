package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println(problem202a(a, b, c))
}

fun problem202a(a: Int, b: Int, c: Int): Int {
    return 7 - a + 7 - b + 7 - c
}