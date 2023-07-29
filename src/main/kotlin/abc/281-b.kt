package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem281b(s))
}

fun problem281b(s: String): String {
    if (s.length != 8) return "No"
    for (i in 0 until s.length) {
        if (i == 0 || i == s.length - 1) {
            if (!(s[i] in 'A'..'Z')) {
                return "No"
            }
        } else if (i == 1) {
            if (!(s[i] in '1'..'9')) {
                return "No"
            }
        } else if (s[i] in '0'..'9') {
        } else return "No"
    }
    return "Yes"
}