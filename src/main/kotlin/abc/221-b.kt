package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem221b(s, t))
}

fun problem221b(s: String, t: String): String {
    var count = 0
    for (i in 0 until s.length) {
        if (s[i] != t[i]) {
            count++
            if (!((i != s.length - 1 && s[i] == t[i + 1]) ||
                        (i != 0 && s[i] == t[i - 1]))) return "No"
        }
    }
    return if (count <= 2) "Yes" else "No"
}