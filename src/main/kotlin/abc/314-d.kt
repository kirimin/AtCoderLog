package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    val q = sc.nextInt()
    val txc = (0 until q).map {
        Triple(sc.next().toInt(), sc.next().toInt(), sc.next())
    }
    println(problem314d(n, s, q, txc))
}

fun problem314d(n: Int, s: String, q: Int, txc: List<Triple<Int, Int, String>>): String {
    var sArray = s.toCharArray().toMutableList()
    var isLower = -1
    var isUpper = -1
    for (i in 0 until q) {
        val (t, x, c) = txc[i]
        when (t) {
            1 -> {
                sArray[x - 1] = c[0]
            }
            2 -> {
                isLower = i
            }
            3 -> {
                isUpper = i
            }
        }
    }
    val max = Math.max(isLower, isUpper)
    if (max == -1) {
        return sArray.joinToString("")
    }
    for (i in max until q) {
        val (t, x, c) = txc[i]
        when (t) {
            1 -> {
                sArray[x - 1] = c[0]
            }
            2 -> {
                sArray = sArray.map { it.toLowerCase() }.toMutableList()
            }
            3 -> {
                sArray = sArray.map { it.toUpperCase() }.toMutableList()
            }
        }
    }
    return sArray.joinToString("")
}