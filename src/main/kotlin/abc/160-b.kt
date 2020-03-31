package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextLong()
    println(problem160b(x))
}

fun problem160b(x: Long): Long {
    return (x / 500) * 1000 + x % 500 / 5 * 5
}