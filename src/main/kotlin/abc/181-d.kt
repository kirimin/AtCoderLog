package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem181d(s))
}

fun problem181d(s: String): String {
    val ss = s.groupBy { it }
    for (i in 1..125) {
        var tmp = (8 * i).toString()
        tmp = if (tmp.length == 2 && s.length >= 3) {
            "0$tmp"
        } else if (tmp.length == 1 && s.length >= 2) {
            "00$tmp"
        } else {
            tmp
        }
        var flag = true
        for (j in 0 until tmp.length) {
            if (tmp.count { it == tmp[j] } > ss[tmp[j]]?.size ?: 0) {
                flag = false
            }
        }
        if (flag) return "Yes"
    }
    return "No"
}