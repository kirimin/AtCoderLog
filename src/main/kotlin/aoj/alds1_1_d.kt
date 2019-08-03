package aoj

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next().toLong()
    val rList = (0 until n).map { sc.next().toLong() }

    var max = Long.MIN_VALUE
    var min = rList[0]
    rList.drop(1).forEach { ri ->
        max = kotlin.math.max(max, ri - min)
        min = kotlin.math.min(min, ri)
    }
    println(max)
}