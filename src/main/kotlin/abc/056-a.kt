package abc

import java.util.*

fun main(args : Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.next()
    val b = sc.next()
    println(problem56a(a, b))
}

fun problem56a(a: String, b: String): String {
    return if (a == "H") {
        if (b == "H") {
            "H"
        } else {
            "D"
        }
    } else {
        if (b == "H") {
            "D"
        } else {
            "H"
        }
    }
}