package abc

import utilities.debugCount
import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val k = sc.nextLong()
    println(problem234c(k))
}

fun problem234c(k: Long): String {
    /**
     * 10進数を１０進数未満に変換
     * @param n 値
     * @param b 変換後の進数
     */
    fun base10to(n: Long, b: Int): String {
        if (n == 0L) return "0"
        var n = n
        var num = ""
        while (n != 0L) {
            val mod = n % b
            num = mod.toString() + num
            n /= b
        }
        return num
    }

    return base10to(k, 2).map { if (it == '1') '2' else it }.joinToString("")
}