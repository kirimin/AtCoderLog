package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem140a(n))
}

fun problem140a(n: Int): Long {
    var count = 0L
    for (i in 1..n) {
        for (j in 1..n) {
            for (k in 1..n) {
                count++
            }
        }
    }
    return count
}