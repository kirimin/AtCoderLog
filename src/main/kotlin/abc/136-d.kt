package abc

import utilities.debugLog
import java.lang.StringBuilder
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem136d(s))
}

fun problem136d(s: String): String {
    val s = s + "R"
    val list = IntArray(s.length - 1)
    var current = s[0]
    var count = 0
    for (i in 0 until s.length) {
        val si = s[i]
        if (current != si) {
            if (current == 'R') {
                if (count % 2 == 0) {
                    list[i] += count / 2
                    list[i - 1] += count / 2
                } else {
                    list[i] += count / 2
                    list[i - 1] += count / 2 + 1
                }
            } else {
                if (count % 2 == 0) {
                    list[i - count - 1] += count / 2
                    list[i - count] += count / 2
                } else {
                    list[i - count - 1] += count / 2
                    list[i - count] += count / 2 + 1
                }
            }
            if (i != s.length) {
                current = s[i]
            }
            count = 1
            continue
        }
        count++
        current = s[i]
    }
    val sb = StringBuilder()
    list.forEach {
        sb.append("$it ")
    }

    return sb.toString()
}