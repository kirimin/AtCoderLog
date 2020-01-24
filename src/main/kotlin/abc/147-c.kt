package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = (0 until n).map {
        (0 until sc.next().toInt()).map {
            sc.next().toInt() - 1 to sc.next().toInt()
        }
    }
    println(problem147c(n, a))
}

fun problem147c(
    n: Int,
    a: List<List<Pair<Int, Int>>>
): Int {
    fun judge(bit: Int): Boolean {
        for (i in 0 until n) {
            if (bit and (1 shl i) == 0) continue
            for (xy in a[i]) {
                val (x, y) = xy
                if (y == 1 && bit and (1 shl x) == 0) return false
                if (y == 0 && bit and (1 shl x) != 0) return false
            }
        }
        return true
    }

    var res = 0
    var bit = 0
    while(bit < (1 shl n)) {
        if (judge(bit)) {
            var count = 0
            for (i in 0 until n) {
                if (bit and (1 shl i) != 0) count++
            }
            res = Math.max(res, count)
        }
        bit++
    }
    return res
}