package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    val k = sc.nextInt()
    println(problem032b(s, k))
}

fun problem032b(s: String, k: Int): Int {
    val set = hashSetOf<String>()
    var current = ""
    for (i in 0 until s.length) {
        current += s[i]
        if (current.length == k) {
            set.add(current)
            current = current.drop(1)
        }
    }
    return set.size
}