package abc

import java.math.BigDecimal
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextBigDecimal()
    val b = sc.nextBigDecimal()
    val c = sc.nextBigDecimal()
    val d = sc.nextBigDecimal()
    val e = sc.nextBigDecimal()
    val f = sc.nextBigDecimal()
    println(problem275b(a, b, c, d, e, f))
}

fun problem275b(a: BigDecimal, b: BigDecimal, c: BigDecimal, d: BigDecimal, e: BigDecimal, f: BigDecimal): BigDecimal {
    return ((a * b * c) - (d * e * f)) % BigDecimal.valueOf(998244353)
}