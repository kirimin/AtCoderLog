package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    val c = sc.nextLong()
    val d = sc.nextLong()
    println(problem131c(a, b, c, d))
}

fun problem131c(a: Long, b: Long, c: Long, d: Long): Long {
    fun computeGreatestCommonDivisor(small: Long, big: Long): Long {
        val rest = small % big
        return if (rest == 0L) big else computeGreatestCommonDivisor(big, rest)
    }
    fun computeLeastCommonMultiple(small: Long, big: Long): Long {
        return small * big / computeGreatestCommonDivisor(big, small)
    }
    val bMultiple = b / c + b / d
    val aMultiple = (a - 1) / c + (a - 1) / d
    val leastCommon = if (c > d) {
        computeLeastCommonMultiple(c, d)
    } else {
        computeLeastCommonMultiple(d, c)
    }
    var bAns = b - bMultiple
    bAns += b / leastCommon
    var aAns = (a - 1) - aMultiple
    aAns += (a - 1) / leastCommon
    return bAns - aAns
}