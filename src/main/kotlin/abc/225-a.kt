package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem225a(s))
}

fun problem225a(s: String): Int {
    var set = hashSetOf<String>()
    for (i in 0..2) {
        for (j in 0..2) {
            if (i == j) continue
            for (k in 0..2) {
                if (j == k  || i == k) continue
                set.add(s[i].toString() + s[j] + s[k])
            }
        }
    }
    return set.count()
}