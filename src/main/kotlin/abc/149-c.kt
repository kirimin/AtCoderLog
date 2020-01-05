package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextInt()
    println(problem149c(x))
}

fun problem149c(x: Int): Int {
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
    var x = x
    while (true) {
        if (x % 2 == 0) continue
        if (isPrime(x)) return x
        x++
    }
}