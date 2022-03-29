package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem239a(n))
}

fun problem239a(n: Int): Double {
    return Math.sqrt(n * (12800000.0 + n))
}