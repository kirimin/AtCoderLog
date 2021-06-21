package other_contests.zone

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem2021d(s))
}

fun problem2021d(s: String): String {
    val t = LinkedList<Char>()
    var isRevers = false
    for (i in 0 until s.length) {
        val si = s[i]
        if (si == 'R') {
            isRevers = !isRevers
        } else {
            if (isRevers) {
                if (t.isNotEmpty() && t[0] == si) {
                    t.removeFirst()
                } else {
                    t.addFirst(si)
                }
            } else {
                if (t.isNotEmpty() && t.last() == si) {
                    t.removeLast()
                } else {
                    t.addLast(si)
                }
            }
        }
    }
    return if (isRevers) t.reversed().joinToString("") else t.joinToString("")
}