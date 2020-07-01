package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    println(problem142d(a, b))
}

fun problem142d(a: Long, b: Long): Int {
    /**
     * 最大公約数
     * @param big 2つの値の大きな方
     * @param small 2つの値の小さな方
     */
    fun computeGreatestCommonDivisor(big: Long, small: Long): Long {
        val rest = big % small
        return if (rest == 0L) small else computeGreatestCommonDivisor(small, rest)
    }
    /**
     * 素因数分解
     */
    fun computePrimeFactorList(n: Long): List<Pair<Long, Long>> {
        val p = mutableListOf<Pair<Long, Long>>()
        var primeFactor = n
        for (i in 2..(Math.sqrt(n.toDouble()) + 1).toLong()) {
            if (primeFactor % i != 0L) continue
            var count = 0L
            while (primeFactor % i == 0L) {
                primeFactor /= i
                count++
            }
            p.add(i to count)
        }
        if (primeFactor != 1L) p.add(primeFactor to 1L)
        return p
    }
    val list = listOf(a, b)
    val g = computeGreatestCommonDivisor(list.max()!!, list.min()!!)
    val p = computePrimeFactorList(g)
    return p.map { it.first }.count() + 1
}