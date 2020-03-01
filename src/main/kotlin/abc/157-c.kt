package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    val m = scan.nextInt()
    val sc = (0 until m).map {  scan.next().toInt() to scan.next().toInt() }
    println(problem157c(n, m, sc))
}

fun problem157c(n: Int, m: Int, sc: List<Pair<Int, Int>>): Int {
    val sc = sc.sortedBy { it.first }
    val start = when (n) {
        2 -> 10
        3 -> 100
        else -> 0
    }
    val end = when (n) {
        2 -> 99
        3 -> 999
        else -> 9
    }
    for (i in start..end) {
        val iStr = i.toString()
        if (iStr.length != n) continue
        var isMatch = true
        for (j in 0 until m) {
            val scj = sc[j]
            if (iStr[scj.first - 1].toString() != scj.second.toString()) {
                isMatch = false
                break
            }
        }
        if (isMatch) return i
    }
    return -1
}