package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem024a(n))
}

fun problem024a(n: Int): Int {
    return n / 2 + n % 2
}