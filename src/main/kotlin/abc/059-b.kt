package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.next()
    val b = sc.next()
    println(problem059b(a, b))
}

fun problem059b(a: String, b: String): String {
    when {
        a.length > b.length -> return "GREATER"
        a.length < b.length -> return "LESS"
    }
    for (i in 0 until a.length) {
        return if (a[i].toInt() > b[i].toInt()) {
            "GREATER"
        } else if (a[i].toInt() < b[i].toInt()) {
            "LESS"
        } else {
            continue
        }
    }
    return "EQUAL"
}