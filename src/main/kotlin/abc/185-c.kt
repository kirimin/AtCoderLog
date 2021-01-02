package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val l = sc.nextInt()
    println(problem185c(l))
}

fun problem185c(l: Int): Long {
    val map = hashMapOf<Pair<Long, Long>, Long>()
    /**
     * 組み合わせ
     */
    fun nCr(n: Long, r: Long): Long {
        if (r == 0L || r == n)
            return (1);
        else if (r == 1L)
            return (n)
        if (map.containsKey(n to r)) return map[n to r]!!
        map.put(n to r, nCr(n - 1, r - 1) + nCr(n - 1, r))
        return map[n to r]!!
    }
    return nCr(l - 1L,12 - 1)
}