package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    println(problem159a(n, m))
}

fun problem159a(n: Int, m: Int): Int {
    return n * (n - 1) / 2 + m * (m - 1) / 2
}