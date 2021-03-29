package arc

import java.math.BigInteger
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val b = sc.nextLong()
    val c = sc.nextLong()
    println(problem112b(b, c))
}

fun problem112b(b: Long, c: Long): Long {
    var ans = 1L
    if (b < c / 2) {
        if (c % 2 != 0L) ans -= 2 else ans--
    }
    var tmpB = Math.abs(b).toBigInteger() * BigInteger.valueOf(2)
    val bb = if (BigInteger.valueOf(c - 2) < tmpB) c - 2 else tmpB.toLong()
    ans += Math.min(c - 2, bb) + c
    return ans
}