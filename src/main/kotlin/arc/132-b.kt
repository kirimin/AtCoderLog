package arc

import utilities.debugCount
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val p = (0 until n).map { sc.next().toInt() }
    println(problem132b(n, p))
}

fun problem132b(n: Int, p: List<Int>): Int {
    var min = Integer.MAX_VALUE
    val set = mutableSetOf<List<Int>>()
    fun sort(p: List<Int>, count: Int) {
//        debugLog(p, count)
        if (count >= n) return
        if (set.contains(p)) {
            return
        }
        if (p == (1..n).toList()) {
            min = Math.min(min, count)
            return
        }
        set.add(p)
        sort(p.reversed(), count + 1)
        sort((p + p.first()).drop(1), count + 1)
    }
    sort(p, 0)
    return min
}