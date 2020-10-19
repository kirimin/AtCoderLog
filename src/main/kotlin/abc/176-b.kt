package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next()
    println(problem176b(n))
}

fun problem176b(n: String): String {
    var sum = 0L
    for (i in 0 until n.length) {
        val ni = n[i]
        sum += ni.toString().toInt()
    }
    return if (sum == 0L || sum % 9 == 0L) "Yes" else "No"
}