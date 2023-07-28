package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s1 = sc.next()
    val s2 = sc.next()
    val s3 = sc.next()
    val s4 = sc.next()
    val s5 = sc.next()
    val s6 = sc.next()
    val s7 = sc.next()
    val s8 = sc.next()
    println(problem296b(s1, s2, s3, s4, s5, s6, s7, s8))
}

fun problem296b(s1: String, s2: String, s3: String, s4: String, s5: String, s6: String, s7: String, s8: String): String {
    val list = listOf(s1, s2, s3, s4, s5, s6, s7, s8)
    val abcdef = charArrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h')
    for (i in 0 until 8) {
        for (j in 0 until 8) {
            if (list[i][j] == '*') {
                return "${abcdef[j]}${8 - i}"
            }
        }
    }
    return ""
}