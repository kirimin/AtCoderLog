package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val a = (0 until m).map {
        val c = sc.next().toInt()
        (0 until c).map { sc.next().toInt() }
    }
    println(problem289c(n, m, a))
}

fun problem289c(n: Int, m: Int, a: List<List<Int>>): Int {
    fun integerToList(bit: Int, n: Int): List<Int> {
        val s = mutableListOf<Int>()
        for (i in 0 until n) {
            if (bit and (1 shl i) != 0) {
                s.add(i)
            }
        }
        return s
    }

    var bit = 0
    // 0からnまで
    var count = 0
    while (bit < (1 shl m)) {
        // 選択された数のリスト
        val s = integerToList(bit, m)
//        debugLog(s)
        val set = mutableSetOf<Int>()
        for (i in 0 until s.size) {
            set.addAll(a[s[i]])
        }
        if (set.size == n) count++
        bit++
    }
    return count
}