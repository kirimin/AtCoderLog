package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val t = sc.next()
    println(problem103b(s, t))
}

fun problem103b(s: String, t: String): String {
    val s = s.toMutableList()
    val t = t.toList()
    var count = 0
    while (s != t) {
        s.add(0, s[s.size - 1])
        s.removeAt(s.size - 1)
        count++
        if (count > s.size) return "No"
    }
    return "Yes"
}