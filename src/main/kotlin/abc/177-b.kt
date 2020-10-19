package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem177b(s, t))
}

fun problem177b(s: String, t: String): Int {
    var min = Integer.MAX_VALUE
    for (i in 0..s.length - t.length) {
        val sub = s.substring(i, i + t.length)
        var count = 0
        for (j in 0 until t.length) {
            val subJ = sub[j]
            if (subJ != t[j]) count++
        }
        min = Math.min(min, count)
    }
    return min
}