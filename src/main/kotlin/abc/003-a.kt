package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem003a(n))
}

fun problem003a(n: Int): Int {
    var sum = 0.0
    for (i in 1..n) {
        sum += i * 10000 * (1 / n.toDouble())
    }
    return sum.toInt()
}