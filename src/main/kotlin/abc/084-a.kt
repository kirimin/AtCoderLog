package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val m = sc.nextInt()
    println(problem084a(m))
}

fun problem084a(m: Int): Int {
    return 48 - m
}