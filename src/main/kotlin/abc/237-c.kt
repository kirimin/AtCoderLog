package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem237c(s))
}

fun problem237c(s: String): String {
    var left = 0
    var right = s.length - 1
    var lc = 0
    var rc = 0
    while (left != s.length) {
        if (s[left] != 'a') {
            break
        }
        left++
        lc++
    }
    while (right != -1) {
        if (s[right] != 'a') {
            break
        }
        right--
        rc++
    }
    if (lc > rc) return "No"
    while (left < right) {
        if (s[left] != s[right]) {
            return "No"
        }
        left++
        right--
    }

    return "Yes"
}
