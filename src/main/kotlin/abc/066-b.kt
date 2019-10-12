package abc

import utilities.debugLog
import java.lang.StringBuilder
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val b = sc.next()
    println(problem066b(b))
}

fun problem066b(b: String): Int {
    var str = b
    while (str.isNotEmpty()) {
        str = str.dropLast(1)
        if (str.length % 2 != 0) continue
        val front = str.take(str.length / 2)
        val back = str.drop(str.length / 2)
        if (front == back) break
    }
    return str.length
}