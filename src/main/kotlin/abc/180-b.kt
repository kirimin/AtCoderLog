package abc

import java.math.BigDecimal
import java.math.BigInteger
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = (0 until n).map { sc.next().toInt() }
    println(problem180b(n, x))
}

fun problem180b(n: Int, x: List<Int>): String {
//    var m = 0L
//    var y = BigDecimal(0)
//    var c = 0
//    for (i in 0 until n) {
//        val xi = Math.abs(x[i])
//        m += xi
//        val bxi = BigDecimal(xi)
//        y += bxi.multiply(bxi)
//        c = Math.max(c, xi)
//    }
//    y = Math.sqrt(y)
    var m = 0L
    var y = 0.0
    var c = 0
    for (i in 0 until n) {
        val xi = Math.abs(x[i])
        m += xi
        y += Math.pow(xi.toDouble(), 2.0)
        c = Math.max(c, xi)
    }
    y = Math.sqrt(y)
    return m.toString() + "\n" + y + "\n" + c
}