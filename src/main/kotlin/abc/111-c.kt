package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val v = (0 until n).map { sc.next().toInt() }
    println(problem111c(n, v))
}

fun problem111c(n: Int, v: List<Int>): Int {
    val grouping = v.groupBy { it }.toList().sortedBy { it.second.count() }
    val mostNum = grouping.last().first
    val nextNum = if (grouping.size == 1) mostNum + 1 else grouping[grouping.size - 2].first
    var count1 = 0
    for (i in 0 until v.size) {
        if ((i + 1) % 2 == 0 && v[i] != mostNum) {
            count1++
        } else if ((i + 1) % 2 != 0 && v[i] != nextNum) {
            count1++
        }
    }
    var count2 = 0
    for (i in 0 until v.size) {
        if ((i + 1) % 2 == 0 && v[i] != nextNum) {
            count2++
        } else if ((i + 1) % 2 != 0 && v[i] != mostNum) {
            count2++
        }
    }

    return Math.min(count1, count2)
}