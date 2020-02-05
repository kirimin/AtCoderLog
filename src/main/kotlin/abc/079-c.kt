package abc

import utilities.debugLog
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val abcd = sc.next().toCharArray().map { it.toString().toInt() }
    println(problem079c(abcd))
}

fun problem079c(n: List<Int>): String {
    val a = n[0]
    val b = n[1]
    val c = n[2]
    val d = n[3]
    return when {
        a + b + c + d == 7 -> "$a+$b+$c+$d=7"
        a - b + c + d == 7 -> "$a-$b+$c+$d=7"
        a + b - c + d == 7 -> "$a+$b-$c+$d=7"
        a + b + c - d == 7 -> "$a+$b+$c-$d=7"
        a + b - c + d == 7 -> "$a+$b-$c+$d=7"
        a + b - c - d == 7 -> "$a+$b-$c-$d=7"
        a - b - c + d == 7 -> "$a-$b-$c+$d=7"
        a - b + c - d == 7 -> "$a-$b+$c-$d=7"
        a - b - c - d == 7 -> "$a-$b-$c-$d=7"
        else -> ""
    }
}