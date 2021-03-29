package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem192b(s))
}

fun problem192b(s: String): String {
    for (i in 0 until s.length) {
        if ((i + 1) % 2 == 0) {
            if (s[i] != s[i].toUpperCase()) return "No"
        } else {
            if (s[i] == s[i].toUpperCase()) return "No"
        }
    }
    return "Yes"
}