package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem106b(n))
}

fun problem106b(n: Int): Int {
    fun countDivisor(n: Long): Long {
        var count = 0L
        for (i in 1..n) {
            if (n % i == 0L) count++
        }
        return count
    }
    var count = 0
    for (i in 1..n) {
        if (i % 2 != 0 && countDivisor(i.toLong()) == 8L) count++
    }
    return count
}