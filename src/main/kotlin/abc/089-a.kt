package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem089a(n))
}

fun problem089a(n: Int): Int {
    return n / 3
}