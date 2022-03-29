package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem232b(s, t))
}

fun problem232b(s: String, t: String): String {
    val list = ('a'..'z').toList()
    val map = mutableMapOf<Char, Int>()
    for (i in 0 until list.size) {
        map[list[i]] = i
    }
    for (i in 0 until 26) {
        var isOk = true
        for (j in 0 until s.length) {
            var charI = map[s[j]]!!
            charI = (charI + i)
            if (t[j] != (list[charI % 26])) {
                isOk = false
                break
            }
        }
        if (isOk) return "Yes"
    }
    return "No"
}