package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map { sc.next().toLong() }
    println(problem197c(n, a))
}

fun problem197c(n: Int, a: List<Long>): Long {
    fun integerToList(bit: Int, n:Int): List<Int> {
        val s = mutableListOf<Int>()
        for(i in 0 until n) {
            if (bit and (1 shl i) != 0) {
                s.add(i)
            }
        }
        return s
    }

    var min = Long.MAX_VALUE
    var bit = 0
    // 0からnまで
    while(bit < (1 shl n)) {
        // 選択された数のリスト
        val s = integerToList(bit, n)
        bit++
        val xor = mutableListOf<List<Long>>()
        var index = 0
        for (i in 0 until s.size) {
            val list = a.subList(index, s[i])
            if (list.isNotEmpty()) {
                xor.add(list)
            }
            index = s[i]
        }
        val list = a.subList(index, a.lastIndex + 1)
        if (list.isNotEmpty()) {
            xor.add(list)
        }
//        debugLog(xor)
        if (xor.isNotEmpty()) {
            min = Math.min(min, xor.map { it.reduce { acc, l -> acc or l } }.reduce { acc, l -> acc xor l })
        }
    }
    return min
}