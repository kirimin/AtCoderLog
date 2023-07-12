package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem304b(n))
}

fun problem304b(n: Long): Long {
    if (n < 999) {
        return n
    }
    if (n < 10000) {
        return (Math.floor(n.toDouble() / 10) * 10).toLong()
    }
    if (n < 100000) {
        return (Math.floor(n.toDouble() / 100) * 100).toLong()
    }
    if (n < 1000000) {
        return (Math.floor(n.toDouble() / 1000) * 1000).toLong()
    }
    if (n < 10000000) {
        return (Math.floor(n.toDouble() / 10000) * 10000).toLong()
    }
    if (n < 100000000) {
        return (Math.floor(n.toDouble() / 100000) * 100000).toLong()
    }
    if (n < 1000000000) {
        return (Math.floor(n.toDouble() / 1000000) * 1000000).toLong()
    }
    if (n < 10000000000) {
        return (Math.floor(n.toDouble() / 10000000) * 10000000).toLong()
    }
    if (n < 100000000000) {
        return (Math.floor(n.toDouble() / 100000000) * 100000000).toLong()
    }
    return 0L
}