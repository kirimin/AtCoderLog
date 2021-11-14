package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem227c(n))
}

fun problem227c(n: Long): Long {
    var count = 0L
    for (a in 1..n) {
        for (b in a..n) {
            val c = n / b / a
            if (c == 0L) return count
            if (c < b) {
                break
            }
            count += c - (b - 1)
        }
    }
    return count
}