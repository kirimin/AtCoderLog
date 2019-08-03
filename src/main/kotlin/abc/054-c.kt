package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next().toInt()
    val m = sc.next().toInt()
    val aList = mutableListOf<Int>()
    val bList = mutableListOf<Int>()
    repeat((0 until m).count()) {
        aList.add(sc.next().toInt())
        bList.add(sc.next().toInt())
    }
    problem54c(n, m, aList, bList)
}

fun problem54c(n: Int, m: Int, aList: List<Int>, bList: List<Int>): Int {
    return 0
}