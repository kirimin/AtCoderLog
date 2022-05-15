package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val s = (0 until n).map { sc.next() }
    println(problem249c(n, k, s))
}

fun problem249c(n: Int, k: Int, s: List<String>): Int {
    fun integerToList(bit: Int, n:Int): List<Int> {
        val s = mutableListOf<Int>()
        for(i in 0 until n) {
            if (bit and (1 shl i) != 0) {
                s.add(i)
            }
        }
        return s
    }

    var max = 0
    var bit = 0
    while(bit < (1 shl n)) {
        // 選択された数のリスト
        val ints = integerToList(bit, n)
        bit++
        if (ints.size < k) continue
        val countMap = mutableMapOf<Char, Int>()
        for (i in 0 until ints.size) {
            for (c in s[ints[i]]) {
                countMap[c] = (countMap[c] ?: 0) + 1
            }
        }
        max = Math.max(max, countMap.filter { it.value == k }.count())
    }

    return max
}