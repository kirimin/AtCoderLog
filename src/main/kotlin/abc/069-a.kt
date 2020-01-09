package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    println(problem069a(n, m))
}

fun problem069a(n: Int, m: Int): Int {
    return (n - 1) * (m - 1)
}