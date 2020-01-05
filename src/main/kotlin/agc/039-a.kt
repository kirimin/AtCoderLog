package agc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val k = sc.nextLong()
    println(problemagc039(s, k))
}

fun problemagc039(s: String, k: Long): Long {
    if (s.length == 1) {
        return k / 2L
    }

    val sa = s.toCharArray()
    var lastFrag = 0
    for (i in 0 until sa.size) {
        if (i == sa.size - 1) {
            if (sa[0] == sa[i]) {
                var count = 1
                val first = s[0]
                for (j in 1 until sa.size) {
                    if (first == s[j]) count++ else break
                }
                if (count % 2 == 0) {
                    break
                } else if (s.filter { s[0] == it }.length == s.length) {
                    lastFrag = (k / 2).toInt()
                    if (k % 2 != 0L) {
                        lastFrag++
                    }
                    sa[i] = '_'
                } else {
                    lastFrag = 1
                    sa[i] = '_'
                }
            }
        } else {
            if (sa[i] == sa[i + 1] && (i == 0 || sa[i] != sa[i - 1])) {
                sa[i + 1] = '_'
            }
        }
    }
    return sa.toList().count { it == '_' }.toLong() * k - lastFrag
}