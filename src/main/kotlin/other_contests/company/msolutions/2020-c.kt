package other_contests.company.msolutions

import com.sun.org.apache.xpath.internal.operations.Bool
import utilities.debugLog
import java.math.BigInteger
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem2020c(n, k, a))
}

fun problem2020c(n: Int, k: Int, a: List<Long>): String {
    val s = Array<Boolean>(n + 1) { false }
    for (i in 0 until n) {
        if (i < k) {
            continue
        } else {
            s[i] = a[i - k] < a[i]
        }
    }
    val ans = mutableListOf<String>()
    for (i in k until s.size - 1) {
        if (s[i]) ans.add("Yes") else ans.add("No")
    }
    return ans.joinToString("\n")
}