package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem139d(n))
}

fun problem139d(n: Long): Long {
    return (1 until n).sum()
}