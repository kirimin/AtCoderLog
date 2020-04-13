package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem098c(n, s))
}

fun problem098c(n: Int, s: String): Int {
    val array = Array(n) { Integer.MAX_VALUE to Integer.MAX_VALUE }
    var firstCount = 0
    for (i in 1 until n) {
        val si = s[i]
        if (si == 'E') firstCount++
    }
    array[0] = 0 to firstCount
    for (i in 1 until n) {
        val si = s[i]
        val (prevLeft, prevRight) = array[i - 1]
        val left = prevLeft + if (s[i - 1] == 'W') 1 else 0
        val right = prevRight - if (s[i] == 'E') 1 else 0
        array[i] = left to right
    }
    return array.map { it.first + it.second }.min()!!
}