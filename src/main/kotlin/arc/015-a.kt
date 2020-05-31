package arc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem015a(n))
}

fun problem015a(n: Int): Double {
    return (9 / 5.0 * n) + 32
}