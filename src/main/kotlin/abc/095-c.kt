package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    val c = sc.nextLong()
    val x = sc.nextLong()
    val y = sc.nextLong()
    println(problem095c(a, b, c, x, y))
}

fun problem095c(a: Long, b: Long, c: Long, x: Long, y: Long): Long {
    val min = Math.min(x, y)

    fun normal(): Long {
        val maxPrice = if (min == x) b else a
        return c * min * 2 + ((x - min) + (y - min)) * maxPrice
    }

    fun noSeparate(): Long {
        return a * x + b * y
    }

    fun allSeparate(): Long {
        return c * Math.max(x, y) * 2
    }

    return listOf(normal(), noSeparate(), allSeparate()).min()!!
}
