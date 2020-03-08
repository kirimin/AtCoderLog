package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val a = sc.nextLong()
    val b = sc.nextLong()
    println(problem158b(n, a, b))
}

fun problem158b(n: Long, a: Long, b: Long): Long {
    val ab = a + b
    if (a == 0L) return 0
    var nDiv = n / ab
    var nAmari = n % ab
    if (nAmari > a) nAmari = a
    return (nDiv * a) + nAmari
}