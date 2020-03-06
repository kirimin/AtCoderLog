package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val h = (0 until n).map { sc.next().toInt() }
    println(problem116c(n, h))
}

fun problem116c(n: Int, h: List<Int>): Int {
    val h = h.toIntArray()
    val list = IntArray(n) { 0 }
    var count = 0
    while (true) {
        var isSame = true
        for (i in 0 until n) {
            if (list[i] != h[i]) {
                list[i] += 1
                if (isSame) count++
                isSame = false
            } else {
                isSame = true
            }
        }
        if (list.toList() == h.toList()) break
    }
    return count
}