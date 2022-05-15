package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    val k = sc.nextLong()
    println(problem248b(a, b, k))
}

fun problem248b(a: Long, b: Long, k: Long): Int {
    var a = a
    var count = 0
    while (a < b) {
        try {
            a = Math.multiplyExact(a, k)
            count++
        } catch (e: java.lang.Exception) {
            count++
            break
        }
    }
    return count
}