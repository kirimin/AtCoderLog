package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem131a(s))
}

fun problem131a(s: String): String {
    val str = s.toList()
    var result = "Good"
    (0..str.size).forEach { i ->
        if (i >= str.size - 1) return@forEach
        if (str[i] == str[i + 1]) {
            result = "Bad"
            return result
        }
    }
    return result
}