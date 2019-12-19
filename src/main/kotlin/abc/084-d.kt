package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val q = sc.nextInt()
    val lr = (0 until q).map { sc.next().toInt() to sc.next().toInt() }
    println(problem084d(q, lr))
}

fun problem084d(q: Int, lr: List<Pair<Int, Int>>): String {
    /**
     * 素数判定
     */
    fun isPrime(num: Int): Boolean {
        if (num < 2) return false
        if (num == 2) return true
        if (num % 2 == 0) return false

        val sqrtNum = Math.sqrt(num.toDouble()).toInt()
        for (i in 3..sqrtNum step 2) {
            if (num % i == 0) return false
        }
        return true
    }

    fun sieveOfEratosthenes(n: Int): List<Int> {
        val primes = IntArray(n) { 0 }
        for (i in 2..n) {
            if (isPrime(i)) {
                primes[i] = i
                for (j in i * 2 until n step i) {
                    primes[j] = 0
                }
            }
        }
        return primes.filter { it != 0 }
    }
    val primes = sieveOfEratosthenes(Math.pow(10.toDouble(), 5.toDouble()).toInt())
    val a = mutableListOf<Int>()
    for (i in 0 until Math.pow(10.toDouble(), 5.toDouble()).toInt()) {
        a.add(if (primes.contains(i) && primes.contains((i + 1) / 2)) 1 else 0)
    }
    a.add(0)
    val s = IntArray(Math.pow(10.toDouble(), 5.toDouble()).toInt() + 1) { 0 }
    for (i in 0 until Math.pow(10.toDouble(), 5.toDouble()).toInt()) {
        s[i + 1] = s[i] + a[i]
    }
    val ans = mutableListOf<Int>()
    for (i in 0 until q) {
        val (l, r) = lr[i]
        ans.add(s[r + 1] - s[l])
    }
    return ans.joinToString("\n")
}