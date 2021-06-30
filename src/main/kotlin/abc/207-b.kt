package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    println(problem207b(a, b, c, d))
}

fun problem207b(a: Int, b: Int, c: Int, d: Int): Int {
    var blue = a.toLong()
    var red = 0L
    var count = 0
    var diff = blue - red * d
    while (true) {
        if (blue <= red * d) {
            return count
        }
        blue += b
        red += c
        count++
        if (count == 1) {
            diff = blue - red * d
        }
        if (count == 100) {
            if (diff <= blue - red * d) return -1
        }
    }
}