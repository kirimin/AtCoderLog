package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem169d(n))
}

fun problem169d(n: Long): Long {
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

    val pf = computePrimeFactorList(n)
    var count = 0L
    for (i in 0 until pf.size) {
        var (_, num) = pf[i]
        for (j in 1..num) {
            if (0 <= num - j) {
                num -= j
                count++
            }
        }
    }
    return count
}