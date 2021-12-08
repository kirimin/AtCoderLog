package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a = sc.next()
    val b = sc.next()
    println(problem229b(a, b))
}

fun problem229b(a: String, b: String): String {
    var a = a
    var b = b
    if (a.length > b.length) {
        b = (1..a.length - b.length).map { "0" }.joinToString("") + b
    } else if (b.length > a.length) {
        a = (1..b.length - a.length).map { "0" }.joinToString("") + a
    }
    for (i in 0 until a.length) {
        val ai = a[i].toString().toInt()
        val bi = b[i].toString().toInt()
        if (ai + bi >= 10) return "Hard"
    }
    return "Easy"
}