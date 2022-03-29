package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextLong()
    val s = sc.next()
    println(problem243d(n, x, s))
}

fun problem243d(n: Int, x: Long, s: String): Long {
    val max = 1000000000000000000L
    var current = x
    var isOver = false
    var overCount = 0
    loop@ for (i in 0 until n) {
        val si = s[i]
        if (isOver) {
            if (si == 'U') {
                overCount--
                if (overCount == 0) {
                    isOver = false
                }
            } else {
                overCount++
            }
            continue@loop
        }
        when (si) {
            'U' -> {
                current /= 2
            }
            'R' -> {
                if (current * 2 + 1 >= max) {
                    isOver = true
                    overCount++
                    continue@loop
                }
                current = current * 2 + 1
            }
            'L' -> {
                if (current * 2 >= max) {
                    isOver = true
                    overCount++
                    continue@loop
                }
                current *= 2
            }
        }
    }
    return current
}
