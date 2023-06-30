package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem259c(s, t))
}

fun problem259c(s: String, t: String): String {
    if (s.length > t.length) return "No"
    val s = s
    val t = t
    var sIndex = 0
    var tIndex = 0
    while (sIndex != s.length || tIndex != t.length) {
        if (sIndex == s.length) {
            if (sIndex >= 1 && s[sIndex - 1] == t[tIndex]) {
                tIndex++
            } else {
                return "No"
            }
            continue
        } else if (tIndex == t.length) {
            return "No"
        }
        val si = s[sIndex]
        val ti = t[tIndex]
        if (si != ti) {
            if (sIndex >= 2 && s[sIndex - 1] == s[sIndex - 2]) {
                tIndex++
            } else {
                return "No"
            }
        } else {
            sIndex++
            tIndex++
        }
    }
    return "Yes"
}