package abc

import utilities.debugCount
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    println(problem180c(n))
}

fun problem180c(n: Long): String {
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

    return enumDivisors(n).joinToString("\n")
}