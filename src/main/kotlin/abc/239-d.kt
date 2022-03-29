package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    println(problem239d(a, b, c, d))
}

fun problem239d(a: Int, b: Int, c: Int, d: Int): String {
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
    /**
     * エラトステネスのふるい。1からnまでの素数を列挙する
     */
    fun sieveOfEratosthenes(n: Int): List<Int> {
        val primes = (2..n).toMutableList()
        for (i in 2..n) {
            if (isPrime(i)) {
                for (j in i * 2..n step i) {
                    primes.remove(j)
                }
            }
        }
        return primes
    }
    val sosu = sieveOfEratosthenes(200).toSet()

    for (i in a..b) {
        var isAble = false
        for (j in c..d) {
            if (sosu.contains(i + j)) {
                isAble = true
            }
        }
        if (!isAble) return "Takahashi"
    }
    return "Aoki"
}