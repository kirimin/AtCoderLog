package other_contests.company.aising

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem2020c(n))
}

fun problem2020c(n: Int): String {
    val map = hashMapOf<Int, Int>()
    for (x in 1..100) {
        val x2 = x * x
        for (y in 1..100) {
            val y2 = y * y
            for (z in 1..100) {
                val z2 = z * z
                if (x2 + y2 + z2 + x * y + y * z + z * x <= n) {
                    map[x2 + y2 + z2 + x * y + y * z + z * x] = map[x2 + y2 + z2 + x * y + y * z + z * x]?.plus(1) ?: 1
                }
            }
        }
    }
    val ans = IntArray(n + 1)
    for (i in 1 until n + 1) {
        ans[i] = map[i] ?: 0
    }
    return ans.drop(1).joinToString("\n")
}