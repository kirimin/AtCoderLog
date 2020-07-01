package other_contests.company.tokiomarine

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
//    val a = (0 until n).map { sc.next().toInt() }
    println(problem2020a(s))
}

fun problem2020a(s: String): String {
    return s[0].toString() + s[1] + s[2]
}