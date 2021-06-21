package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem198a(n))
}

fun problem198a(n: Int): Int {
    return n - 1
}