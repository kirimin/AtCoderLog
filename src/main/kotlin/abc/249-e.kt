package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val p = sc.nextLong()
    println(problem249e(n, p))
}

fun problem249e(n: Int, p: Long): Int {
    /**
     * 階乗を計算する
     */
    fun computeFactorial(n: Long): Long {
        val mod = p
        return (1..n).toList().reduce { acc, l -> acc * l % mod }
    }

    return 0
}