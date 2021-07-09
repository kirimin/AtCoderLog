package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val p = sc.nextLong()
    println(problem208b(p))
}

fun problem208b(p: Long): Long {
    val coins = listOf(1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800).sortedDescending()
    var count = 0L
    val useCount = IntArray(10) { 100 }
    var p = p
    while(p != 0L) {
        for (i in 0 until coins.size) {
            if (p >= coins[i] && useCount[i] != 0) {
                p-= coins[i]
                useCount[i]--
                count++
                break
            }
        }
    }
    return count
}