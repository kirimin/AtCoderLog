package abc

import utilities.debugLog
import java.math.BigInteger
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = (0 until 64).map { sc.next().toInt() }
    println(problem306b(a))
}

fun problem306b(a: List<Int>): String {
    var ans = BigInteger.ZERO
    for (i in 0 until 64) {
        if (a[i] == 1) {
            ans += BigInteger.valueOf(2).pow(i)
        }
    }
    return ans.toString()
}