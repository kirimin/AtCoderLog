package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    val x = sc.nextLong()
    println(problem146c(a, b, x))
}

fun problem146c(a: Long, b: Long, x: Long): Long {
    val max = 1000000000L
    var start = 0L
    var end = max
    val price = fun (n: Long): Long = a * n + b * n.toString().length
    while (true) {
        val n = (start + end) / 2
        if (start > end || price(n) == x) {
            return if (n == 0L) return 0 else n
        } else if (price(n) < x) {
            start = n + 1
        } else {
            end = n - 1
        }
    }
}