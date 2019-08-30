package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem085a(s))
}

fun problem085a(s: String): String {
    return s.replace("2017", "2018")
}