package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s1 = sc.next()
    val s2 = sc.next()
    val s3 = sc.next()
    println(problem059a(s1, s2, s3))
}

fun problem059a(s1: String, s2: String, s3: String): String {
    return (s1.take(1) + s2.take(1) + s3.take(1)).toUpperCase()
}