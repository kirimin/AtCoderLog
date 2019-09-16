package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem141b(s))
}

fun problem141b(s: String): String {
    for (i in s.indices) {
        if ((i + 1) % 2 == 0) {
            if (s[i] == 'L' || s[i] == 'U' || s[i] == 'D') {

            } else {
                return "No"
            }
        } else {
            if (s[i] == 'R' || s[i] == 'U' || s[i] == 'D') {

            } else {
                return "No"
            }
        }
    }
    return "Yes"
}