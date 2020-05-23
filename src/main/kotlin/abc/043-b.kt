package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem043b(s))
}

fun problem043b(s: String): String {
    var ans = ""
    for (i in 0 until s.length) {
        val si = s[i]
        when (si) {
            '0' -> ans += "0"
            '1' -> ans += "1"
            else -> ans = ans.dropLast(1)
        }
    }
    return ans
}