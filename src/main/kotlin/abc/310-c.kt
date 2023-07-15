package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem310c(n, s))
}

fun problem310c(n: Int, s: List<String>): Int {
    val set = mutableSetOf<String>()
    for (i in 0 until n) {
        val reversed = s[i].reversed()
        if (!set.contains(reversed)) {
            set.add(s[i])
        }
    }
    return set.count()
}