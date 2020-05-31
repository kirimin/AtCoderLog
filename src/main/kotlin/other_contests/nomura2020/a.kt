package other_contests.nomura2020

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val h1 = sc.nextInt()
    val m1 = sc.nextInt()
    val h2 = sc.nextInt()
    val m2 = sc.nextInt()
    val k = sc.nextInt()
    println(problema(h1, m1, h2, m2, k))
}

fun problema(h1: Int, m1: Int, h2: Int, m2: Int, k: Int): Int {
    val m1 = m1 + h1 * 60
    val m2 = m2 + h2 * 60
    return m2 - m1 - k
}