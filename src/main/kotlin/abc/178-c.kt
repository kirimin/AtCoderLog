package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem178c(n.toLong()))
}

fun problem178c(n: Long): Long {
    class ModInt(value: Long) {

        /***
         * 10^9 + 7
         */
        val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()

        val value = ((value % mod) + mod) % mod

        operator fun plus(other: ModInt): ModInt = ModInt(((value + other.value) % mod + mod) % mod)

        operator fun minus(other: ModInt): ModInt = ModInt(((value - other.value) % mod + mod) % mod)

        operator fun times(other: ModInt): ModInt = ModInt(((value * other.value) % mod + mod) % mod)

        operator fun div(other: ModInt): ModInt = ModInt(((value / other.value) % mod + mod) % mod)
    }

    fun Long.toModInt() = ModInt(this)


    val pow9 = longPow(9, n, true).toModInt()
    val pow8 = longPow(8, n, true).toModInt()
    return (longPow(10, n, true).toModInt() + pow8 - (pow9 * (2L).toModInt())).value
}

fun longPow(a: Long, b: Long, needMod: Boolean = false): Long {

    /***
     * 10^9 + 7
     */
    val mod: Long = (Math.pow(10.0, 9.0) + 7).toLong()
    var ans = 1L
    for (i in 0 until b) {
        ans *= a
        if (needMod) ans %= mod
    }
    return ans
}

// 1 -> 0
// 2 -> 100 - x = 2
// 3 -> 1000 - x {946} = 54
// 4 -> 10000 - x = 974

// 0~9^n - 1~9^n
// 0~9^n - (1~9^nの中で0~8^nのものを引く)
// 1~8^n) 217

// 000
// 999
// 090
// 111 x