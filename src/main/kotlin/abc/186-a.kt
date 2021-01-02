package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val w = sc.nextInt()
    println(problem186a(n, w))
}

fun problem186a(n: Int, w: Int): Int {
    return n / w
}