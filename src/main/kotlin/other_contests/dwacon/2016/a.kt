package other_contests.dwacon.`2016`

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problema(n))
}

fun problema(n: Long): Long {
    return (n / 25L)
}