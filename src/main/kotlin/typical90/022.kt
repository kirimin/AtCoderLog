package typical90

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    val c = sc.nextLong()
    println(problem022(a, b, c))
}

fun problem022(a: Long, b: Long, c: Long): Long {
    /**
     * 最大公約数
     */
    fun computeGreatestCommonDivisor(a: Long, b: Long): Long {
        val big: Long
        val small: Long
        if (a > b) {
            big = a
            small = b
        } else {
            small = a
            big = b
        }
        val rest = big % small
        return if (rest == 0L) small else computeGreatestCommonDivisor(small, rest)
    }

    val r = computeGreatestCommonDivisor(computeGreatestCommonDivisor(a, b), c)
    return a / r + b / r + c / r - 3
}
