package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem285b(n, s))
}

fun problem285b(n: Int, s: String): String {
    val ans = mutableListOf<Int>()
    for (i in 1 until n) {
        var count = 0
        for (j in 0 until   n - i) {
            if (s[j] != s[j + i]) {
                count++
            } else {
                break
            }
        }
        ans.add(count)
    }
    return ans.joinToString("\n")
}