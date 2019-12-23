package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val s = sc.next()
    val t = sc.next()
    println(problem148b(n, s, t))
}

fun problem148b(n: Int, s: String, t: String): String {
    var str = ""
    for (i in 0 until n) {
        str += s[i].toString() + t[i].toString()
    }
    return str
}