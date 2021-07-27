package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val c = (0 until n).map { sc.next().toLong() }
    println(problem210c(n, k, c))
}

fun problem210c(n: Int, k: Int, c: List<Long>): Int {
    if (k == 1) return 1
    val map = mutableMapOf<Long, Int>()
    val set = mutableSetOf<Long>()
    var max = 0
    for (i in 0 until n) {
        set.add(c[i])
        map[c[i]] = (map[c[i]] ?: 0) + 1
        if (i >= k - 1) {
            max = Math.max(max, set.size)
            map[c[i - k + 1]] = map[c[i - k + 1]]!! - 1
            if (map[c[i - k + 1]] == 0) {
                set.remove(c[i - k + 1])
            }
            set.add(c[i])
        }
    }
    return max
}