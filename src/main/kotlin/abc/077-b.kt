package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem077b(n))
}

fun problem077b(n: Long): Long {
    var max = 1L
    for (i in 1..n / 2) {
        if (i * i <= n) {
            max = i * i
        }
    }
    return max.toLong()
}