package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val n = sc.next()
    println(problem222a(n))
}

fun problem222a(n: String): String {
    var s = n
    while (s.length != 4) {
        s = "0$s"
    }
    return s
}