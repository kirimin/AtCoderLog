package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val k = sc.nextLong()
    println(problem192c(n, k))
}

fun problem192c(n: Long, k: Long): Long {
    fun g1(x: Long) = x.toString().toCharArray().sortedDescending().joinToString("").toLong()
    fun g2(x: Long) = x.toString().toCharArray().sorted().joinToString("").toLong()
    fun f(x: Long) = g1(x) - g2(x)
    var tmp = n
    for (i in 1..k) {
        tmp = f(tmp)
    }
    return tmp
}