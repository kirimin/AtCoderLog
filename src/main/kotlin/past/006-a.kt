package past

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem006a(s))
}

fun problem006a(s: String): String {
    return if (s[3] == '-') "Yes" else "No"
}