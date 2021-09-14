package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s1 = sc.next()
    val s2 = sc.next()
    val s3 = sc.next()
    println(problem217b(s1, s2, s3))
}

fun problem217b(s1: String, s2: String, s3: String): String {
    val list = listOf(s1, s2, s3)
    return if (!list.contains("ABC")) "ABC"
    else if (!list.contains("ARC")) "ARC"
    else if (!list.contains("AGC")) "AGC"
    else "AHC"
}