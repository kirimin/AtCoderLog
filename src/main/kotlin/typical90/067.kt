package typical90

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next()
    val k = sc.nextInt()
    println(problem067(n, k))
}

fun problem067(n: String, k: Int): String {
    fun toBase10(n: String, b: Int): Long {
        var ten = 0L
        for (i in 0 until n.length) {
            fun longPow(a: Long, b: Long): Long {
                var ans = 1L
                for (i in 0 until b) {
                    ans *= a
                }
                return ans
            }
            ten += n[n.length - i - 1].toString().toLong() * (longPow(b.toLong(), i.toLong()))
        }
        return ten
    }
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

    var n = n
    for (i in 0 until k) {
        val nineNum = base10to(toBase10(n, 8), 9).map { if (it == '8') '5' else it }
        n = nineNum.joinToString("")
    }

    return n
}