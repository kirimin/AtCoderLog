package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s1 = sc.next()
    val s2 = sc.next()
    val s3 = sc.next()
    val s4 = sc.next()
    println(problem211b(s1, s2, s3, s4))
}

fun problem211b(s1: String, s2: String, s3: String, s4: String): String {
    return if (setOf(s1, s2, s3, s4).size == 4) "Yes" else "No"
}