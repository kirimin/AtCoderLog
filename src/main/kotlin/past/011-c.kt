package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val m = sc.nextInt()
    println(problem011c(n, m))
}

fun problem011c(n: Long, m: Int): String {
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

    val num = 1_000_000_000L
    var str = "o"
    var isOver = false
    for (i in 2..m) {
        if (isOver) {
            str += "x"
            continue
        }
        val pow = Math.pow(n.toDouble(), i.toDouble())
        if (pow in 1..num) {
            str += "o"
        } else {
            str += "x"
            isOver = true
        }
    }
    return str
}