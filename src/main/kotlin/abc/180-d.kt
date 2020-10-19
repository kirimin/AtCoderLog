package abc

import java.lang.Exception
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.nextLong()
    val y = sc.nextLong()
    val a = sc.nextLong()
    val b = sc.nextLong()
    println(problem180d(x, y, a, b))
}

fun problem180d(x: Long, y: Long, a: Long, b: Long): Long {
    var count = 0L
    var x = x
    while (true) {
        try {
            Math.multiplyExact(x, a)
            if (x * a < b) {
                x *= a
                if (x >= y) break
                count++
            } else {
                count += (y - x) / b
                if ((y - x) % b == 0L) count--
                break
            }
        } catch (e: Exception) {
            count += (y - x) / b
            if ((y - x) % b == 0L) count--
            break
        }
    }
    return count
}