package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem190d(n))
}

fun problem190d(n: Long): Int {
    /**
     * nに含まれる約数列挙
     */
    fun enumDivisors(n: Long): List<Long> {
        val list = mutableListOf<Long>()
        for (i in 1..Math.sqrt(n.toDouble()).toLong()) {
            if (n % i == 0L) {
                list.add(i)
                if (n / i != i) list.add(n / i)
            }
        }
        return list.sorted()
    }
    var count = 0
    val list = enumDivisors(n)
    for (i in 0 until list.size) {
        if (list[i] % 2 == 1L) {
            count++
        }
    }
    return count * 2
}