package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextLong()
    val k = sc.nextInt()
    println(problem273b(x, k))
}

fun problem273b(x: Long, k: Int): Long {
    var ans = x
    for (i in 1 .. k) {
        ans = Math.round(ans / Math.pow(10.0, i.toDouble())) * Math.pow(10.0, i.toDouble()).toLong()
    }
    return ans
}