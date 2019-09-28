package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem124c(s))
}

fun problem124c(s: String): Int {
    val BLACK = "0"
    val WHITE = "1"
    val dp = (s.indices).map { "0" }.toMutableList()
    var count = 0
    dp[0] = s[0].toString()
    for (i in 1 until s.length) {
        if (s[i].toString() == BLACK && dp[i - 1] == BLACK) {
            count++
            dp[i] = WHITE
        } else if(s[i].toString() == WHITE && dp[i - 1] == WHITE) {
            count++
            dp[i] = BLACK
        } else {
            dp[i] = s[i].toString()
        }
    }
    return count
}