package typical90

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextInt()
    val c = sc.nextInt()
    println(problem020(a, b, c))
}

fun problem020(a: Long, b: Int, c: Int): String {
    fun longPow(a: Long, b: Long): Long {
        var ans = 1L
        for (i in 0 until b) {
            ans *= a
        }
        return ans
    }

    return if (a < longPow(c.toLong(), b.toLong())) "Yes" else "No"
}
