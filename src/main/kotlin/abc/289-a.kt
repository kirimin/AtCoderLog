package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem289a(s))
}

fun problem289a(s: String): String {
    var ans = ""
    for (i in 0 until s.length) {
        val si = s[i].toString()
        if (si == "0") {
            ans += "1"
        } else {
            ans += "0"
        }
    }
    return ans
}