package abc

import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val d = sc.nextInt()
    val xy = (0 until n).map { sc.next().toInt() to sc.next().toInt() }
    println(problem304c(n, d, xy))
}

fun problem304c(n: Int, d: Int, xy: List<Pair<Int, Int>>): String {
    // ユークリッド距離を求める
    fun euclidDistance(x1: Int, y1: Int, x2: Int, y2: Int): Double {
        return Math.sqrt((x1 - x2).toDouble().pow(2) + (y1 - y2).toDouble().pow(2))
    }
    val ans = BooleanArray(n + 1)
    ans[0] = true
    fun function(i: Int) {
        for (j in 0 until n)  {
            val (x1, y1) = xy[i]
            val (x2, y2) = xy[j]
            val distance = euclidDistance(x1, y1, x2, y2)
            if (distance <= d) {
                if (ans[j]) continue
                ans[j] = true
                function(j)
            }
        }
    }
    function(0)
    return ans.map { if (it) "Yes" else "No" }.dropLast(1).joinToString("\n")
}