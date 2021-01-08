package arc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n =sc.next().toLong()
    println(problem109b(n))
}

fun problem109b(n: Long): Long {
    var count = Math.sqrt(n + 1.0).toLong()
    var current = count * (count + 1) / 2
    while (current <= n + 1) {
        if ((count + 1) * (count + 1 + 1) / 2 > n + 1) break
        count++
        current = count * (count + 1) / 2
    }
    return n - count + 1
}