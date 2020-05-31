package other_contests.nomura2020

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val t = sc.next()
    println(problemb(t))
}

fun problemb(t: String): String {
    return t.replace("?", "D")
}