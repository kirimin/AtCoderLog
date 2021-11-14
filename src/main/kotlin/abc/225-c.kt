package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val m = sc.nextInt()
    val b = (0 until n).map { (0 until m).map { sc.next().toLong() } }
    println(problem225c(n, m, b))
}

fun problem225c(n: Int, m: Int, b: List<List<Long>>): String {
    var firstI = 0L
    var firstJ = 0L
    for (i in 0 until 7) {
        if ((b[0][0]) % (7) == i.toLong()) {
            firstI = (b[0][0] / (7))
            firstJ = i.toLong() - 1
            break
        }
    }
//    debugLog("a", firstI, firstJ)
    if (firstJ == -1L) {
        firstI--
        firstJ = 6
    }
    if (firstJ + m > 7) return "No"


    for (i in 0 until n) {
        for (j in 0 until m) {
            val a = (i + firstI) * 7 + j + firstJ + 1
            val b = b[i][j]
//            debugLog(a, b)
            if (a != b) return "No"
        }
    }
    return "Yes"
}