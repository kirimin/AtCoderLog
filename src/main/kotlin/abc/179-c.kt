package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    println(problem179c(n))
}

fun problem179c(n: Int): Int {
    var count = 0
    for (a in 1 until n) {
        count += n / a

        val mod = n % a
        if (mod == 0) {
            count--
        }
    }
    return count
}