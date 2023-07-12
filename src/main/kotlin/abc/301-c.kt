package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem301c(s, t))
}

fun problem301c(s: String, t: String): String {
    val atcoder = charArrayOf('a', 't', 'c', 'o', 'd', 'e', 'r')
    var sAt = s.count { it == '@' }
    var tAt = t.count { it == '@' }
    var ok = true
    for (c in 'a'..'z') {
        val sCount = s.count { it == c }
        val tCount = t.count { it == c }

        if (sCount != tCount && !atcoder.contains(c)) ok = false

        if (sCount > tCount) tAt -= sCount - tCount
        else if (sCount < tCount) sAt -= tCount - sCount
    }
    if (sAt < 0 || tAt < 0) ok = false
    return if (ok) "Yes" else "No"
}