package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem114b(s))
}

fun problem114b(s: String): Int {
    var min = Integer.MAX_VALUE
    for (i in 0 until s.length - 2) {
        val si = (s[i].toString() + s[i+1] + s[i+2]).toInt()
        min = Math.min(min, Math.abs(si - 753))
    }
    return min
}