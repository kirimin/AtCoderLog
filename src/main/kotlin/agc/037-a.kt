package agc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem037a(s))
}

fun problem037a(s: String): Int {
    var count = 1
    var prev = s[0].toString()
    var current = ""
    for (i in 1 until s.length) {
        current += s[i]
        if (prev != current) {
            prev = current
            current = ""
            count++
            continue
        }
    }
    return count
}