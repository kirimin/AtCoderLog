package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem315a(s))
}

fun problem315a(s: String): String {
    return s.filter { it != 'a' && it != 'i' && it != 'u' && it != 'e' && it != 'o' }
}