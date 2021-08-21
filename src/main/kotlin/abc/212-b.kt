package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x = sc.next()
    println(problem212b(x))
}

fun problem212b(x: String): String {
    if (setOf(x[0], x[1], x[2], x[3]).size == 1) return "Weak"
    val index = listOf(9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    if (index[index.indexOf(x[0].toString().toInt()) + 1] == index[index.indexOf(x[1].toString().toInt())] &&
        index[index.indexOf(x[1].toString().toInt()) + 1] == index[index.indexOf(x[2].toString().toInt())] &&
        index[index.indexOf(x[2].toString().toInt()) + 1] == index[index.indexOf(x[3].toString().toInt())]
            ) return "Weak"
    return "Strong"
}