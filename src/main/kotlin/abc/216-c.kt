package abc

import utilities.debugLog
import java.math.BigInteger
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem216c(n))
}

fun problem216c(n: Long): String {
    if (n == 1L) return "A"
    if (n == 2L) return "AA"
    var num = n
    var ans = ""
    while (num != 1L) {
        if (num % 2 != 0L) {
            num--
            ans = "A$ans"
        }
        num /= 2
        ans = "B$ans"
    }
    ans = "A$ans"

    var tmp = 0L
    for (i in 0 until ans.length) {
        if (ans[i] == 'A') tmp++ else tmp *= 2
    }

    return ans
}