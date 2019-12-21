package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem068b(n))
}

fun problem068b(n: Int): Int {
    var max = 0
    var ans = 1
    for (i in 1..n) {
        var div = i
        var count = 0
        while (div % 2 == 0) {
            div /= 2
            count++
        }
        if (max < count) ans = i
        max = Math.max(max, count)
    }
    return ans
}