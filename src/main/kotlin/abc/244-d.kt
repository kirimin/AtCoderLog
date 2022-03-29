package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s1 = sc.next()
    val s2 = sc.next()
    val s3 = sc.next()
    val t1 = sc.next()
    val t2 = sc.next()
    val t3 = sc.next()
    println(problem244d(s1, s2, s3, t1, t2, t3))
}

fun problem244d(s1: String, s2: String, s3: String, t1: String, t2: String, t3: String): String {
    val s = listOf(s1, s2, s3)
    val t = listOf(t1, t2, t3)
    var count = 0
    for (i in 0 until 3) {
        if (s[i] == t[i]) {
            count++
        }
    }
    return when (count) {
        0 -> "Yes"
        1 -> "No"
        3 -> "Yes"
        else -> throw IllegalStateException()
    }
}