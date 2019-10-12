package abc

import utilities.debugCount
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val m = sc.nextLong()
    println(problem065c(n, m))
}

fun problem065c(n: Long, m: Long): Long {
    if (Math.abs(n - m) >= 2) return 0
    val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()
    fun computeFactorial(n: Long): Long {
        return (1..n).toList().reduce { acc, l -> acc * l % mod }
    }

    return if (n != m) {
        computeFactorial(n) * computeFactorial(m) % mod
    } else {
        computeFactorial(n) * computeFactorial(m) * 2 % mod
    }
}

//1 1
//A1B1 B1A1
//2 * (1 * 1) = 2

//1 2
//B1A1B2 B2A1B1
//2

//2 1
//B1A1B2 B2A1B1
//2

//2 2
//A1B1A2B2 A1B2B2B1 A2B1A1B2 A2B2A1B1 B1A1B2A2 B1A2B2B1 B2A1B1A2 B2A2B1A1
//4 * 4[2 * 2] = 8

//3 3
//6 * 12[6 * 2] = 72