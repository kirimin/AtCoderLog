package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    println(problem172a(a))
}

fun problem172a(a: Int): Int {
    return a + a * a + a * a * a
}