package past

import utilities.debugLog
import java.lang.Exception
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val r = sc.nextLong()
    val n = sc.nextLong()
    println(problem3c(a, r, n))
}

fun problem3c(a: Long, r: Long, n: Long): String {
    var ans = a
    for (i in 1 until n) {
        try {
            ans = Math.multiplyExact(ans, r)
        } catch (e: Exception) {
            return "large"
        }
    }
    return if (ans > Math.pow(10.0, 9.0)) {
        "large"
    } else {
        ans.toString()
    }
}