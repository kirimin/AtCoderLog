package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem283c(s))
}

fun problem283c(s: String): Int {
    var count = 0
    var used = false
    for (i in 0 until s.length) {
        if (i < s.length - 1 && s[i] == '0' && s[i + 1] == '0' && !used) {
            used = true
            continue
        } else {
            used = false
            count++
        }
    }
    return count
}