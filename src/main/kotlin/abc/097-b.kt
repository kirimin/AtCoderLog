package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    println(problem97b(x))
}

fun problem97b(x: Int): Int {
    var ans = 1
    for (i in 1..x) {
        for (j in 2..x) {
            val num = Math.pow(i.toDouble(), j.toDouble())
            if (num <= x) ans = Math.max(ans, num.toInt())
        }
    }
    return ans
}