package abc

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val w = sc.next()
    println(problem044b(w))
}

fun problem044b(w: String): String {
    return if (w.groupBy { it }.map { it.value.size }.filter { it % 2 != 0 }.isEmpty()) "Yes" else "No"
}