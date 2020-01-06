package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toInt() }
    println(problem072c(n, a))
}

fun problem072c(n: Int, a: List<Int>): Int {
    val list = mutableListOf<Int>()
    for (i in 0 until n) {
        list.add(a[i] - 1)
        list.add(a[i])
        list.add(a[i] + 1)
    }
    val map = list.groupBy { it }
    var max = 0
    for (i in map) {
        max = Math.max(max, i.value.size)
    }
    return max
}