package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem182c(n))
}

fun problem182c(n: Long): Int {
    val checked = hashSetOf<String>()
    val ans = mutableListOf<Int>()
    fun search(num: String, drop: Int) {
        if (num.isEmpty()) {
            return
        }
        if (num.toLong() % 3 == 0L) {
            ans.add(drop)
        }
        checked.add(num)
        for (i in 0 until num.length) {
            val next = num.removeRange(i..i)
            if (checked.contains(next)) continue
            search(num.removeRange(i..i), drop + 1)
        }
    }
    search(n.toString(), 0)
    return ans.min() ?: -1
}