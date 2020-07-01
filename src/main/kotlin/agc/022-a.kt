package agc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem022a(s))
}

fun problem022a(s: String): String {
    if (s.length < 26) {
        for (alphabet in 'a'..'z') {
            if (!s.contains(alphabet)) {
                return s + alphabet
            }
        }
    }
    if (s.length == 26) {
        for (i in 24 downTo 0) {
            val si = s[i]
            val siP = s[i + 1]
            if (si < siP) {
                val left = s.take(i)
                val right = s.takeLast(i)
                for (j in 'a'..'z') {
                    if (!left.contains(j)) {
                        if (left + j > s) {
                            return left + j
                        }
                    }
                }
            }
        }
    }
    return "-1"
}