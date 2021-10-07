package abc

import utilities.debugLog
import java.math.BigInteger
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toBigInteger() }
    val x = sc.nextBigInteger()
    println(problem220c(n, a, x))
}

fun problem220c(n: Int, a: List<BigInteger>, x: BigInteger): Long {
    var aSum = BigInteger.ZERO
    for (i in 0 until n) {
        aSum += a[i]
    }
    val div = x / aSum
    var sum = aSum * div
    var i = n - 1
    var k = div * n.toBigInteger()
    while (true) {
        if (sum > x) return k.toLong()
        k++
        i++
        if (i == n) i = 0
        sum += a[i]
    }
}