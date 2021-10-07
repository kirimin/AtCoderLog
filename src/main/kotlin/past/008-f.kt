package past

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem008f(n, s))
}

fun problem008f(n: Int, s: String): String {
    val ones = mutableSetOf<Int>()
    val zeros = ArrayDeque<Int>()
    for (i in 0 until n) {
        val si = s[i]
        if (si == '1') {
            ones.add(i + 1)
        } else {
            zeros.add(i + 1)
        }
    }
    val ans = mutableListOf<Int>()
    for (i in 1..n) {
        if (ones.contains(i)) {
            ans.add(i)
        } else {
            if (zeros.isEmpty()) return "-1"
            var tmp = zeros.removeLast()
            if (tmp == i) {
                if (zeros.isEmpty()) return "-1"
               zeros.addFirst(tmp)
               tmp = zeros.removeLast()
            }
            ans.add(tmp)
        }
    }
    return ans.joinToString(" ")
}