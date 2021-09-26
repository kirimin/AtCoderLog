package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s1 = sc.next()
    val s2 = sc.next()
    val s3 = sc.next()
    val t = sc.next()
    println(problem219b(s1, s2, s3, t))
}

fun problem219b(s1: String, s2: String, s3: String, t: String): String {
    var ans = ""
    for (i in 0 until t.length) {
        val ti = t[i]
        ans += when (ti) {
            '1' -> s1
            '2' -> s2
            '3' -> s3
            else -> ""
        }
    }
    return ans
}