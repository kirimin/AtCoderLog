package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem194d(n))
}

fun problem194d(n: Int): Double {
    var ans = 0.0
    for (i in n - 1 downTo 1) {
        ans += n / (n - i.toDouble())
    }

    return ans
}