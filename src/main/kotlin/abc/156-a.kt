package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val r = sc.nextInt()
    println(problem156a(n, r))
}

fun problem156a(n: Int, r: Int): Int {
    return if (10 <= n) r else r + (100 * (10 - n))
}