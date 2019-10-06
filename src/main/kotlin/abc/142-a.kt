package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem142a(n))
}

fun problem142a(n: Int): Double {
    return if (n % 2 == 0) (n / 2) / n.toDouble() else (n / 2 + 1) / n.toDouble()
}