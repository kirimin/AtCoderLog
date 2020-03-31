package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextLong()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem109c(n, x, a))
}

fun problem109c(n: Int, x: Long, a: List<Long>): Long {
    /**
     * 最大公約数
     * @param big 2つの値の大きな方
     * @param small 2つの値の小さな方
     */
    fun computeGreatestCommonDivisor(big: Long, small: Long): Long {
        val rest = big % small
        return if (rest == 0L) small else computeGreatestCommonDivisor(small, rest)
    }

    if(n == 1) {
        return Math.abs(x - a[0])
    }

    val list = mutableListOf<Long>()
    for (i in 0 until n) {
        list.add(Math.abs(x - a[i]))
    }
    val divs = mutableListOf<Long>()
    var min = Long.MAX_VALUE
    for (i in 0 until n - 1) {
        min = Math.min(min, computeGreatestCommonDivisor(list[i], list[i + 1]))
        divs.add(min)
    }
//    debugLog(list)
//    debugLog(divs)
    return divs.min()!!
}

// 3 5
// 1 3 7 -> 2
 // 5 - 1 = 4
 // 5 - 3 = 2
 // 5 - 7 = -2

// 3 6
// 3 9 12 -> 3
 // 6 - 3 = 3
 // 6 - 9 = -3
 // 6 - 12 = -6

// 3 5
// 3 9 12 -> 1
  // 5 - 3 = 2
  // 5 - 9 = -4
  // 5 - 12 = -7

// 3 4
// 3 9 12 -> 1
 // 4 - 3 = 1
 // 4 - 9 = -5
 // 4 - 12 = -8

//3 81
//33 105 57 -> 24
 // 81 - 33 = 48
 // 81 - 105 = -24
 // 81 - 57 = 24