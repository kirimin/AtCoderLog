package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    println(problem306a(n, s))
}

fun problem306a(n: Int, s: String): String {
    var s2 = ""
    for (i in 0 until n) {
        s2 += s[i].toString() + s[i]
    }
    return s2
}