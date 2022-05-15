package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val k = sc.nextInt()
    println(problem248c(n, m, k))
}

fun problem248c(n: Int, m: Int, k: Int): Long {
    val mod = 998244353
    /**
     * 組み合わせ
     */
    fun nCr(n: Long, r: Long): Long {
        if (r == 0L || r == n)
            return (1);
        else if (r == 1L)
            return (n);
        return (nCr(n - 1, r - 1) + nCr(n - 1, r))
    }
    debugLog(nCr(41, 592))

    return 0
}

// Nの数列で、合計がK以下で、任意のAiがM以下
// すべて1でもNは超える