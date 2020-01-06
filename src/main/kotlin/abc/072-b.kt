package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val s = sc.next()
    println(problem072b(s))
}

fun problem072b(s: String): String {
    return s.filterIndexed { index, c -> (index + 1) % 2 != 0 }
}