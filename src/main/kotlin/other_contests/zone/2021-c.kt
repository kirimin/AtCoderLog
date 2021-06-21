package other_contests.zone

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val abcde = (0 until n).map {
        listOf(
            sc.next().toLong(),
            sc.next().toLong(),
            sc.next().toLong(),
            sc.next().toLong(),
            sc.next().toLong()
        )
    }
    println(problem2021c(n, abcde))
}

fun problem2021c(n: Int, abcde: List<List<Long>>): Long {
//    var max = listOf(0L, 0L, 0L)
//    for (i in 0 until n) {
//        val p = abcde[i][0]
//        if (p > max[0]) {
//            debugLog(max)
//            max = max.drop(1).plus(p).sorted()
//        }
//    }
//    return max.min()!!
//    val dp = Array(n) { Array(n * 3) { LongArray(5) } }
//    for (i in 0 until n) {
//
//    }
    return 0
}