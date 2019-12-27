package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    println(problem126c(n, k))
}

fun problem126c(n: Int, k: Int): Double {
    var sum = 0.0
    for (i in 1..n) {
        var j = i.toDouble()
        var count = 0.0
        while (j < k) {
            count++
            j *= 2
        }
        sum += 1.0 / n * Math.pow(1 / 2.0,  count.toDouble())
    }
    return sum
}