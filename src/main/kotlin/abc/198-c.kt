import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val r = sc.nextInt()
    val x = sc.nextInt()
    val y = sc.nextInt()
    println(problem198c(r, x, y))
}

fun problem198c(r: Int, x: Int, y: Int): Long {
    /**
     * Doubleを使わないpow
     */
    fun longPow(a: Long, b: Long, needMod: Boolean = false): Long {
        /***
         * 10^9 + 7
         */
        val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()
        var ans = 1L
        for (i in 0 until b) {
            ans *= a
            if (needMod) ans %= mod
        }
        return ans
    }

    fun euclid(x1: Long, y1: Long, x2: Long, y2: Long): Double {
        return Math.sqrt((longPow(x1 - x2, 2) + longPow(y1 - y2, 2).toDouble()))
    }

    val e = euclid(0, 0, x.toLong(), y.toLong())
    if (e < r) {
        return 2
    }
    if (e % r == 0.0) {
        return (e / r).toLong()
    }
    val e2 = e.toLong()
    for (i in e2 + 1..Long.MAX_VALUE) {
        if (i % r == 0L) {
            return i / r
        }
    }
    return 0
}