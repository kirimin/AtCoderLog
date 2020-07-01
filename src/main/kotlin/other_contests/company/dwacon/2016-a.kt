package other_contests.company.dwacon

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem2016a(n))
}

fun problem2016a(n: Long): Long {
    return (n / 25L)
}