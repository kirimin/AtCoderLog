package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextInt()
    val y = sc.nextInt()
    println(problem260c(n, x, y))
}

fun problem260c(n: Int, x: Int, y: Int): Long {
    val reds = LongArray(11) { 0 }
    val blues = LongArray(11) { 0 }
    reds[n] = 1
    fun exchange1(level: Int) {
        val count = reds[level]
        reds[level] = 0
        reds[level - 1] += count
        blues[level] += count * x
    }
    fun exchange2(level: Int) {
        val count = blues[level]
        reds[level - 1] += count
        blues[level - 1] += count * y
    }
    for (i in 10 downTo 2) {
        exchange1(i)
        exchange2(i)
    }
    return blues[1]
}