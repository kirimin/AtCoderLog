package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val c = sc.next()
    println(problem174d(n, c))
}

fun problem174d(n: Int, c: String): Int {
    val c = c.toCharArray()
    var w = 0
    var r = 0
    for (i in 0 until n) {
        if (c[i] == 'W') w++ else r++
    }
    var count = 0
    for (i in r until n) {
        if (c[i] == 'R') count++
    }
    return count
}