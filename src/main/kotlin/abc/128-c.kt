package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val s = (0 until m).map {
        (0 until sc.next().toInt()).map { sc.next().toInt() - 1 }
    }
    val p = (0 until m).map { sc.next().toInt() }
    println(problem128c(n, m, s, p))
}

fun problem128c(
    n: Int,
    m: Int,
    s: List<List<Int>>,
    p: List<Int>
): Int {
    /**
     * 整数を「どのアイテムを選ぶのか」を表すListに変換
     * @param bit 集合を表す整数
     * @param n 何個のものについて考えているか
     */
    fun integerToList(bit: Int, n:Int): List<Int> {
        val s = mutableListOf<Int>()
        for(i in 0 until n) {
            if (bit and (1 shl i) != 0) {
                s.add(i)
            }
        }
        return s
    }

    var res = 0
    var bit = 0
    while(bit < (1 shl n)) {
        val selected = integerToList(bit, n)
        var ok = true
        for (i in 0 until m) {
            val pi = p[i]
            var count = 0
            for (j in s[i]) {
                if (selected.contains(j)) count++
            }
            if (count % 2 != pi) ok = false
        }
        if (ok) res++
        bit++
    }
    return res
}