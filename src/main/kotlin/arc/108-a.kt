package arc

import utilities.debugLog
import java.lang.Exception
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.nextLong()
    val p = sc.nextLong()
    println(problem108a(s, p))
}

fun problem108a(s: Long, p: Long): String {
    for (i in 100000000L downTo 1) {
        try {
            val n = i
            val m = p / n
            if (n + m == s) return "Yes"
        } catch (e: Exception) {
            break
        }
    }
    return "No"
}