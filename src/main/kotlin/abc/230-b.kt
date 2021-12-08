package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem230b(s))
}

fun problem230b(s: String): String {
    var t = ""
    for (i in 0 until 1000) {
        t += "oxx"
    }
    return if (t.contains(s)) "Yes" else "No"
}