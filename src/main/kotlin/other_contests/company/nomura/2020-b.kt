package other_contests.company.nomura

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val t = sc.next()
    println(problem2020b(t))
}

fun problem2020b(t: String): String {
    return t.replace("?", "D")
}