package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var m = n * 2 - 1
    val a = (0 until n * 2 - 1).mapIndexed { i, _ ->
        val list = (0 until m).mapIndexed { j, _ ->
            sc.next().toLong() to (i + 1 to i + j + 2)
        }
        m--
        list
    }
    println(problem236d(n, a))
}

fun problem236d(n: Int, a: List<List<Pair<Long, Pair<Int, Int>>>>): Long {
    fun integerToList(bit: Int, n: Int): List<Int> {
        val s = mutableListOf<Int>()
        for (i in 0 until n) {
            if (bit and (1 shl i) != 0) {
                s.add(i)
            }
        }
        return s
    }

    val a = a.flatten()
    var max = 0L
    fun search(num: Long, selected: Int, count: Int) {
        if (count == n) {
            max = Math.max(max, num)
            return
        }
        for (i in 0 until a.size) {
            val (ai, ij) = a[i]
            val list = integerToList(selected, n * 2 + 1)
            if (!list.contains(ij.first - 1) && !list.contains(ij.second - 1)) {
                var se = selected
                se = se or (ij.first - 1)
                se = se or (ij.second - 1)
                search(ai xor num, se, count + 1)
            }
        }
    }
    search(0, 0, 0)
    return max
}