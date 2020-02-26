package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = (0 until n).map { sc.next().toInt() }
    println(problem156c(n, x))
}

fun problem156c(n: Int, x: List<Int>): Long {
    val sumList = LongArray(100000) { Long.MAX_VALUE }
    for (i in 0 until 100000) {
        var sum = 0L
        for (j in 0 until n) {
            sum += Math.pow((x[j] - (i+1)).toDouble(), 2.0).toLong()
        }
        sumList[i] = sum
        if (i != 0 && sumList[i] > sumList[i - 1]) break
    }
    return sumList.min()!!
}