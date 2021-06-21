package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem206b(n))
}

fun problem206b(n: Long): Long {
    var current = 0L
    for (i in 1.. Long.MAX_VALUE) {
        current += i
        if (current >= n) return i
    }
    return 0
}