package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem260a(s))
}

fun problem260a(s: String): Any {
    if (s[0] == s[1] && s[0] != s[2]) {
        return s[2]
    } else if (s[0] == s[2] && s[0] != s[1]) {
        return s[1]
    } else if (s[1] == s[2] && s[0] != s[1]) {
        return s[0]
    } else if (s[0] == s[1] && s[0] == s[2]){
        return "-1"
    } else {
        return s[0]
    }
}