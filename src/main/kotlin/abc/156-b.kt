package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextLong()
    val k = sc.nextLong()
    println(problem156b(n, k))
}

fun problem156b(n: Long, k: Long): Int {
    var n = n
    var num = ""
    while (n != 0L) {
        num = (n % k).toString() + num
        n /= k
    }
    return num.length
}