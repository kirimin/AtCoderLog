package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem064c(n, a))
}

fun problem064c(n: Int, a: List<Int>): String {
    var lowCount = 0
    var proCount = 0
    val set = hashSetOf<Int>()
    for (i in 0 until n) {
        val rate = a[i]
        if (rate < 3200) {
            if (!set.contains(rate / 400)) {
                set.add(rate / 400)
                lowCount++
            }
        } else {
            proCount++
        }
    }
    val min = if (lowCount != 0) lowCount else 1
    return "$min ${lowCount + proCount}"
}