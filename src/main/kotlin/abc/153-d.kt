package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h = sc.nextLong()
    println(problem153d(h))
}

fun problem153d(h: Long): Long {
    var count = 1L
    var h2 = h
    while (h2 != 0L) {
        count *= 2
        h2 /= 2
    }
    return count - 1
}