package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.next().toLong()
    val b = sc.next().toLong()
    val c = sc.next().toLong()
    println(problem041b(a, b, c))
}

fun problem041b(a: Long, b: Long, c: Long): Long {
    /***
     * 10^9 + 7
     */
    val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()
    return (((a) * (b) % mod) * c % mod)
}