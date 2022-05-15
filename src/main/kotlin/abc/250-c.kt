package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val q = sc.nextInt()
    val x = (0 until q).map { sc.next().toInt() }
    println(problem25c(n, q, x))
}

fun problem25c(n: Int, q: Int, x: List<Int>): String {
    val a = (0..n).toList().toIntArray()
    val map = mutableMapOf<Int, Int>()
    for (i in 0..n) {
        map[i] = i
    }
    for (i in 0 until q) {
        val xi = x[i]
        val index = map[xi]!!
        if (index == n) {
            val prev = a[index - 1]
            a[index] = prev
            a[index - 1] = xi
            map[prev] = index
            map[xi] = index - 1
        } else {
            val next = a[index + 1]
            a[index] = next
            a[index + 1] = xi
            map[next] = index
            map[xi] = index + 1
        }
    }
    return a.drop(1).joinToString(" ")
}