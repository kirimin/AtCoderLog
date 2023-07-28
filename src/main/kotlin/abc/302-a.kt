package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    println(problem302a(a, b))
}

fun problem302a(a: Long, b: Long): Long {
    return if (a % b != 0L) a / b + 1 else a / b
}