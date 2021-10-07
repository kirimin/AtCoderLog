package past

import java.util.*
import kotlin.math.min

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val k = sc.nextLong()
    val abc = (0 until n).map { Triple(sc.next().toLong(), sc.next().toLong(), sc.next().toLong()) }
    println(problem008g(n, k, abc))
}

fun problem008g(n: Int, k: Long, abc: List<Triple<Long, Long, Long>>): Long {
    /**
     * Doubleを使わないpow
     */
    fun longPow(a: Long, b: Long): Long {
        var ans = 1L
        for (i in 0 until b) {
            ans *= a
        }
        return ans
    }

    var ng = 0L
    var ok = longPow(2, 60)
    while (ng + 1 < ok) {
        val x = (ng + ok) / 2
        var count = 0L
        for (i in 0 until n) {
            if (x < abc[i].second) continue
            val num = (x - abc[i].second) / abc[i].third + 1
            count += min(abc[i].first, num)
        }
        if (k <= count) ok = x else ng = x
    }
    return ok
}

// (2,4,6) (3,7) (2,3,4,6,7) k(4) = 6
// 6 < 2の時、4以下の要素は4個未満
// 6 >= 2の時、4以下の要素は4個以上